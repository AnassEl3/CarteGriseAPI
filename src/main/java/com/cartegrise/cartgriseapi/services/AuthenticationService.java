package com.cartegrise.cartgriseapi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.cartegrise.cartgriseapi.configuration.AuthenticationRequest;
import com.cartegrise.cartgriseapi.configuration.AuthenticationResponse;
import com.cartegrise.cartgriseapi.configuration.RegisterRequest;
import com.cartegrise.cartgriseapi.models.Employe;
import com.cartegrise.cartgriseapi.repositories.EmployeRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthenticationService {

    @Autowired
    private EmployeRepository employeRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private JwtService jwtService;
    @Autowired
    private AuthenticationManager authenticationManager;

    public AuthenticationResponse register(RegisterRequest request){
        Employe employe = Employe.builder()
            .nom(request.getNom())
            .prenom(request.getPrenom())
            .date_naissance(request.getDate_naissance())
            .cin(request.getCin())
            .mot_de_passe(passwordEncoder.encode(request.getMot_de_passe()))
            .build();
        employeRepository.save(employe);
        var jwtToken = jwtService.generateToken(employe);
        return AuthenticationResponse.builder()
            .token(jwtToken)
            .build();
    }

    public AuthenticationResponse authenticate(AuthenticationRequest request){
        // Authenticate the user (Hadles response if the the cridentials in unvalid)
        authenticationManager.authenticate(
            new UsernamePasswordAuthenticationToken(request.getCin(), request.getMot_de_passe())
        );
        // Retrieve the user from db
        var user = employeRepository.findByCin(request.getCin()).orElseThrow();
        // Generate a token
        var jwtToken = jwtService.generateToken(user);
        return AuthenticationResponse.builder()
                .token(jwtToken)
                .build();
    }
}
