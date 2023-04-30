package com.cartegrise.cartgriseapi.v1.controllers;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cartegrise.cartgriseapi.v1.dtos.AdministrationDto;
import com.cartegrise.cartgriseapi.v1.models.Administration;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/v1")
public class AdministrationController {
    
    // @Autowired
    // private AdministrationServices administrationServices;

    // @Autowired
    // private ModelMapper modelMapper;

    // @GetMapping("/administrations")
    // private ResponseEntity<List<Administration>> findAll() {
    //     List<Administration> administrations = administrationServices.findAll();
    //     return new ResponseEntity<>(administrations, HttpStatus.OK); 
    // }

    // @PostMapping("/administrations")
    // private ResponseEntity<Administration> add(@Valid @RequestBody AdministrationDto request) {
    //     Administration administration = modelMapper.map(request, Administration.class);
    //     if(administration == null){
    //         return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    //     }
    //     return new ResponseEntity<>(administration, HttpStatus.CREATED);
    // }

    // @PutMapping("/administrations/{id}")
    // private ResponseEntity<?> replace(@Valid @RequestBody AdministrationDto request, @PathVariable("id") long id) {
    //     Optional<Administration> result = administrationServices.findById(id);
    //     if(!result.isPresent()){
    //         return ResponseEntity.status(HttpStatus.CONFLICT).body( "Pas d'administration avec l'id " + Long.toString(id));
    //     }
    //     Administration administration = result.get();
    //     administration = modelMapper.map(request, Administration.class);
    //     administration = administrationServices.replace(administration);
    //     return new ResponseEntity<>(administration, HttpStatus.OK);
    // }

    // @DeleteMapping("/administrations/{id}")
    // private ResponseEntity<HttpStatus> delete(@PathVariable("id") long id) {
    //     administrationServices.delete(id);
    //     return new ResponseEntity<>(HttpStatus.OK);
    // }

}
