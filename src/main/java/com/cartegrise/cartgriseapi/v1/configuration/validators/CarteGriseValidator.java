package com.cartegrise.cartgriseapi.v1.configuration.validators;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.cartegrise.cartgriseapi.v1.configuration.ValidatorDefinition;
import com.cartegrise.cartgriseapi.v1.models.CarteGrise;

public class CarteGriseValidator implements Validator{
    
    @Autowired
    ValidatorDefinition validatorDefinition;

    @Override
    public boolean supports(Class<?> clazz) {
        return CarteGrise.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        CarteGrise carteGrise = (CarteGrise) target;
        if (validatorDefinition.stringEmpty(carteGrise.getImmatriculation())) {
            errors.rejectValue("immatriculation", "L'immartriculation de véhicule est obligatoire");
        }
        if (validatorDefinition.stringExceedsMax(carteGrise.getImmatriculation(), 20)) {
            errors.rejectValue("immatriculation", "L'immatriculation de carte grise ne doit pas dépasser 20 caractères");
        }
        if (validatorDefinition.stringExceedsMax(carteGrise.getImmatriculation(), 20)) {
            errors.rejectValue("immatriculation_anterieure", "L'immatriculation anterieure de carte grise ne doit pas dépasser 20 caractères");
        }
        if (validatorDefinition.stringExceedsMax(carteGrise.getVehicule_usage(), 20)) {
            errors.rejectValue("vehicule_usage", "L'usage de véhicule ne doit pas dépasser 20 caractères");
        }
    }
    
}
