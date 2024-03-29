package com.cartegrise.cartgriseapi.v1.configuration.filters;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.cartegrise.cartgriseapi.v1.services.JwtService;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class JwtAuthrnticationFilter extends OncePerRequestFilter {

    @Autowired
    private final JwtService jwtService;
    @Autowired
    private final UserDetailsService userDetailsService;
    
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {
        
        if (request.getServletPath().contains("/auth")) {
            filterChain.doFilter(request, response);
            return;
        }
        
        // Check if the request is authenticable & has the token
        final String authHeader = request.getHeader("Authorization");
        if(authHeader == null || !authHeader.startsWith("Bearer ")){
            filterChain.doFilter(request, response);
            return;
        }
        
        // Extract info from token
        final String jwt = authHeader.substring(7);
        final String userCin = jwtService.extractUsername(jwt);

        // Check if user is already logged
        if(userCin != null && SecurityContextHolder.getContext().getAuthentication() == null){
            UserDetails UserDetails = this.userDetailsService.loadUserByUsername(userCin);
            // Check if user & token is valid
            if(jwtService.isTokenValide(jwt, UserDetails)){
                // Set the authentication token for the context holder
                UsernamePasswordAuthenticationToken authToken = new UsernamePasswordAuthenticationToken(UserDetails, null, UserDetails.getAuthorities());
                authToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
                // Update security context holder
                SecurityContextHolder.getContext().setAuthentication(authToken);
            }
        }

        // Pass request to the next filter
        filterChain.doFilter(request, response);
    }
    
}
