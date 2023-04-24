package com.cartegrise.cartgriseapi.v1.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cartegrise.cartgriseapi.v1.dtos.AdministrationDto;
import com.cartegrise.cartgriseapi.v1.models.Administration;
import com.cartegrise.cartgriseapi.v1.services.AdministrationServices;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/v1")
public class AdministrationController {
    
    @Autowired
    private AdministrationServices administrationServices;

    @Autowired
    private ModelMapper modelMapper;

    @GetMapping("/test")
    // @ResponseStatus(HttpStatus.OK)
    private String findAll() {
        return "Working ...";
    }

    @PostMapping("/administrations")
    @ResponseStatus(HttpStatus.CREATED)
    private Administration add(@Valid @RequestBody AdministrationDto request) {
        Administration administration = modelMapper.map(request, Administration.class);
        return administrationServices.add(administration);
    }

}
