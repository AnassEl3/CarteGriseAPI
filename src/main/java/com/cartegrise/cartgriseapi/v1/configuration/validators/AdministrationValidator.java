package com.cartegrise.cartgriseapi.v1.configuration.validators;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.cartegrise.cartgriseapi.v1.configuration.ValidatorDefinition;
import com.cartegrise.cartgriseapi.v1.models.Administration;

public class AdministrationValidator implements Validator {

    @Autowired
    ValidatorDefinition validatorDefinition;
    
    @Override
    public boolean supports(Class<?> clazz) {
        return Administration.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Administration administration = (Administration) target;
        if (validatorDefinition.stringEmpty(administration.getNom())) {
            errors.rejectValue("nom", "Le nom de l'administration est obligatoire");
        }
        if (validatorDefinition.stringExceedsMax(administration.getNom(), 50)) {
            errors.rejectValue("nom", "Le nom de l'administration ne doit pas dépasser 50 caractères");
        }
        if (validatorDefinition.stringExceedsMax(administration.getTelephone(), 15)) {
            errors.rejectValue("nom", "Le téléphone de l'administration ne doit pas dépasser 15 caractères");
        }
        if (validatorDefinition.stringExceedsMax(administration.getTelephone(), 15)) {
            errors.rejectValue("nom", "Le téléphone de l'administration ne doit pas dépasser 15 caractères");
        }
    }
    
}
