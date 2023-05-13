package com.cartegrise.cartgriseapi.v1.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import com.cartegrise.cartgriseapi.v1.configuration.filters.JwtAuthrnticationFilter;

import lombok.RequiredArgsConstructor;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfig {
    
    private final JwtAuthrnticationFilter jwtAuthFilter;
    private final AuthenticationProvider authenticationProvider;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
        
        http
            // Allow cors configuration
            .cors()
            .and()
            // Disable Cross Site Request Forgery (Since clients are not web browsers)
            .csrf()
            .disable()
            // Allow Http requests on the following paths
            .authorizeHttpRequests()
            // Defining endpoints whitelist (do not require authentication)
            .requestMatchers("/auth/**")
            .permitAll()
            // Securing the other endpoints (require authentication)
            .anyRequest()
            .authenticated()
            // Disabling sessions / Configuring session to be stateless (every request should be authenticated)
            .and()
            .sessionManagement()
            .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
            // Define the authentication provider (DaoAuthenticationProvider)
            .and()
            .authenticationProvider(authenticationProvider)
            // Execute our Filter before the spring security filter
            .addFilterBefore(jwtAuthFilter, UsernamePasswordAuthenticationFilter.class);

        return http.build();
    }

    // Configuring the CROS 
    @Bean
    CorsConfigurationSource corsConfigurationSource() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", new CorsConfiguration().applyPermitDefaultValues());
        return source;
    }
}
