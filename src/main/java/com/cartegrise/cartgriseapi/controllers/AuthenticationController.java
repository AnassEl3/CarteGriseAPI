package com.cartegrise.cartgriseapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cartegrise.cartgriseapi.configuration.AuthenticationRequest;
import com.cartegrise.cartgriseapi.configuration.AuthenticationResponse;
import com.cartegrise.cartgriseapi.configuration.RegisterRequest;
import com.cartegrise.cartgriseapi.services.AuthenticationService;

@Controller
@RequestMapping("/auth")
public class AuthenticationController {

    @Autowired
    private AuthenticationService service;
    
    @PostMapping("/register")
    public  ResponseEntity<AuthenticationResponse> register(@RequestBody RegisterRequest request){
        return ResponseEntity.ok(service.register(request));
    }
    
    @PostMapping("/authenticate")
    public  ResponseEntity<AuthenticationResponse> register(@RequestBody AuthenticationRequest request){
        return ResponseEntity.ok(service.authenticate(request));
    }

}
