package com.cartegrise.cartgriseapi.v1.configuration;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cartegrise.cartgriseapi.v1.configuration.validators.AdministrationValidator;
import com.cartegrise.cartgriseapi.v1.configuration.validators.CarteGriseValidator;
import com.cartegrise.cartgriseapi.v1.configuration.validators.CitoyenValidator;
import com.cartegrise.cartgriseapi.v1.configuration.validators.DemandeValidator;
import com.cartegrise.cartgriseapi.v1.configuration.validators.DocumentValidator;
import com.cartegrise.cartgriseapi.v1.configuration.validators.EmployeValidator;
import com.cartegrise.cartgriseapi.v1.configuration.validators.VehiculeValidator;
import com.cartegrise.cartgriseapi.v1.repositories.CitoyenRepository;
import com.cartegrise.cartgriseapi.v1.repositories.EmployeRepository;

import lombok.RequiredArgsConstructor;

@Configuration
@RequiredArgsConstructor
public class ValidatorDefinition {
    
    @Autowired
    EmployeRepository employeRepository;
    
    @Autowired
    CitoyenRepository citoyenRepository;
    
    // Validation functions
    public boolean stringEmpty(String input) {
        return (input == null || input.trim().length() == 0);
    }
    public boolean charEmpty(Character input) {
        return (input == null || input == ' ');
    }
    public boolean integerEmpty(int input) {
        return (input == 0);
    }
    public boolean dateEmpty(Date input) {
        return (input == null);
    }
    public boolean stringExceedsMax(String input, int num) {
        if(input != null){
            return (input.length() >= num);
        }
        return false;
    }
    public boolean integerExceedsMax(int input, int num) {
        return (input >= num);
    }
    public boolean stringBetween(String input, int numMin, int numMax) {
        if(input != null){
            return (input.length()-1 >= numMin && input.length()-1 <= numMax);
        }
        return false;
    }
    public boolean employeCinDuplicate(String input) {
        return employeRepository.findByCin(input).isPresent();
    }
    public boolean citoyenCinDuplicate(String input) {
        return citoyenRepository.findByCin(input).isPresent();
    }

    // Set resource validators
    @Bean
    public EmployeValidator beforeCreateEmployeValidator() {
        return new EmployeValidator();
    }
    @Bean
    public EmployeValidator beforeSaveEmployeValidator() {
        return new EmployeValidator();
    }
    @Bean
    public AdministrationValidator beforeCreateAdministrationValidator() {
        return new AdministrationValidator();
    }
    @Bean
    public AdministrationValidator beforeSaveAdministrationValidator() {
        return new AdministrationValidator();
    }
    @Bean
    public DemandeValidator beforeCreateDemandeValidator() {
        return new DemandeValidator();
    }
    @Bean
    public DemandeValidator beforeSaveDemandeValidator() {
        return new DemandeValidator();
    }
    @Bean
    public DocumentValidator beforeCreateDocumentValidator() {
        return new DocumentValidator();
    }
    @Bean
    public DocumentValidator beforeSaveDocumentValidator() {
        return new DocumentValidator();
    }
    @Bean
    public CitoyenValidator beforeCreateCitoyenValidator() {
        return new CitoyenValidator();
    }
    @Bean
    public CitoyenValidator beforeSaveCitoyenValidator() {
        return new CitoyenValidator();
    }
    @Bean
    public CarteGriseValidator beforeCreateCarteGriseValidator() {
        return new CarteGriseValidator();
    }
    @Bean
    public CarteGriseValidator beforeSaveCarteGriseValidator() {
        return new CarteGriseValidator();
    }
    @Bean
    public VehiculeValidator beforeCreateVehiculeValidator() {
        return new VehiculeValidator();
    }
    @Bean
    public VehiculeValidator beforeSaveVehiculeValidator() {
        return new VehiculeValidator();
    }

}
