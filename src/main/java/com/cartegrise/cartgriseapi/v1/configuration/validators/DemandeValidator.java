package com.cartegrise.cartgriseapi.v1.configuration.validators;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.cartegrise.cartgriseapi.v1.configuration.ValidatorDefinition;
import com.cartegrise.cartgriseapi.v1.models.Demande;

public class DemandeValidator implements Validator{
    
    @Autowired
    ValidatorDefinition validatorDefinition;

    @Override
    public boolean supports(Class<?> clazz) {
        return Demande.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Demande demande = (Demande) target;
        if (validatorDefinition.stringEmpty(demande.getType())) {
            errors.rejectValue("type", "Le type de demande est obligatoire");
        }
        if (validatorDefinition.stringExceedsMax(demande.getType(), 50)) {
            errors.rejectValue("type", "Le type deu demande ne doit pas dépasser 50 caractères");
        }
        if (validatorDefinition.stringEmpty(demande.getEtat())) {
            errors.rejectValue("etat", "L'etat de demande est obligatoire");
        }
        if (validatorDefinition.stringExceedsMax(demande.getEtat(), 2)) {
            errors.rejectValue("etat", "L'etat deu demande ne doit pas dépasser 2 caractères");
        }
    }
}
