package com.cartegrise.cartgriseapi.v1.configuration.validators;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.cartegrise.cartgriseapi.v1.configuration.ValidatorDefinition;
import com.cartegrise.cartgriseapi.v1.models.Citoyen;

public class CitoyenValidator implements Validator{
    
    @Autowired
    ValidatorDefinition validatorDefinition;

    @Override
    public boolean supports(Class<?> clazz) {
        return Citoyen.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Citoyen citoyen = (Citoyen) target;
        if (validatorDefinition.stringEmpty(citoyen.getNom())) {
            errors.rejectValue("nom", "Le nom de citoyen(ne) est obligatoire");
        }
        if (validatorDefinition.stringExceedsMax(citoyen.getNom(), 30)) {
            errors.rejectValue("nom", "Le nom de citoyen(ne) ne doit pas dépasser 30 caractères");
        }
        if (validatorDefinition.stringEmpty(citoyen.getPrenom())) {
            errors.rejectValue("prenom", "Le prenom de citoyen(ne) est obligatoire");
        }
        if (validatorDefinition.stringExceedsMax(citoyen.getPrenom(), 30)) {
            errors.rejectValue("prenom", "Le prenom de citoyen(ne) ne doit pas dépasser 30 caractères");
        }
        if (validatorDefinition.stringEmpty(Character.toString(citoyen.getSexe()))) {
            errors.rejectValue("sexe", "Le sexe de citoyen(ne) est obligatoire");
        }
        if (validatorDefinition.dateEmpty(citoyen.getDate_naissance())) {
            errors.rejectValue("date_naissance", "La date de naissance de citoyen(ne) est obligatoire");
        }
        if (validatorDefinition.stringEmpty(citoyen.getLieu_naissance())) {
            errors.rejectValue("lieu_naissance", "Le lieu naissance de citoyen(ne) est obligatoire");
        }
        if (validatorDefinition.stringExceedsMax(citoyen.getLieu_naissance(), 10)) {
            errors.rejectValue("lieu_naissance", "Le lieu naissance de citoyen(ne) ne doit pas dépasser 10 caractères");
        }
        if (validatorDefinition.stringEmpty(citoyen.getCin())) {
            errors.rejectValue("cin", "Le CIN de citoyen(ne) est obligatoire");
        }
        if (validatorDefinition.stringExceedsMax(citoyen.getCin(), 10)) {
            errors.rejectValue("cin", "Le CIN de citoyen(ne) ne doit pas dépasser 10 caractères");
        }
        if (validatorDefinition.stringExceedsMax(citoyen.getTelephone(), 15)) {
            errors.rejectValue("telephone", "Le téléphone de citoyen(ne) ne doit pas dépasser 15 caractères");
        }
    }

    
}
