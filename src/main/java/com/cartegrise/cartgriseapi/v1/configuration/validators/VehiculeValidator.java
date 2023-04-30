package com.cartegrise.cartgriseapi.v1.configuration.validators;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.cartegrise.cartgriseapi.v1.configuration.ValidatorDefinition;
import com.cartegrise.cartgriseapi.v1.models.Vehicule;

public class VehiculeValidator implements Validator{
    
    @Autowired
    ValidatorDefinition validatorDefinition;

    @Override
    public boolean supports(Class<?> clazz) {
        return Vehicule.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Vehicule vehicule = (Vehicule) target;
        if (validatorDefinition.stringEmpty(vehicule.getModele())) {
            errors.rejectValue("modele", "Le modèle de véhicule est obligatoire");
        }
        if (validatorDefinition.stringExceedsMax(vehicule.getModele(), 15)) {
            errors.rejectValue("modele", "Le modèle de véhicule ne doit pas dépasser 15 caractères");
        }
        if (validatorDefinition.stringEmpty(vehicule.getMarque())) {
            errors.rejectValue("marque", "La marque de véhicule est obligatoire");
        }
        if (validatorDefinition.stringExceedsMax(vehicule.getMarque(), 15)) {
            errors.rejectValue("marque", "La marque de véhicule ne doit pas dépasser 15 caractères");
        }
        if (validatorDefinition.stringEmpty(vehicule.getCarburant())) {
            errors.rejectValue("carburant", "La carburant de véhicule est obligatoire");
        }
        if (validatorDefinition.stringExceedsMax(vehicule.getCarburant(), 15)) {
            errors.rejectValue("carburant", "La carburant de véhicule ne doit pas dépasser 15 caractères");
        }
        if (validatorDefinition.stringEmpty(vehicule.getPuissance())) {
            errors.rejectValue("puissance", "La puissance de véhicule est obligatoire");
        }
        if (validatorDefinition.stringExceedsMax(vehicule.getPuissance(), 15)) {
            errors.rejectValue("puissance", "La carburant de véhicule ne doit pas dépasser 15 caractères");
        }
        if (validatorDefinition.integerEmpty(vehicule.getNb_place())) {
            errors.rejectValue("nb_place", "Le nombre de places de véhicule est obligatoire");
        }
        if (validatorDefinition.integerEmpty(vehicule.getNb_cylindres())) {
            errors.rejectValue("nb_cylindres", "Le nombre des cylindres de véhicule est obligatoire");
        }
    }
    
}
