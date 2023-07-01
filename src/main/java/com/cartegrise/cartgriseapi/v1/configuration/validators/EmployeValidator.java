package com.cartegrise.cartgriseapi.v1.configuration.validators;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.cartegrise.cartgriseapi.v1.configuration.ValidatorDefinition;
import com.cartegrise.cartgriseapi.v1.models.Employe;

public class EmployeValidator implements Validator {

    @Autowired
    ValidatorDefinition validatorDefinition;
    @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    public boolean supports(Class<?> clazz) {
        return Employe.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Employe employe = (Employe) target;
        if (validatorDefinition.stringEmpty(employe.getNom())) {
            errors.rejectValue("nom", "Le nom de l'employé(e) est obligatoire");
        }
        if (validatorDefinition.stringExceedsMax(employe.getNom(), 30)) {
            errors.rejectValue("nom", "Le nom de l'employé(e) ne doit pas dépasser 30 caractères");
        }
        if (validatorDefinition.stringEmpty(employe.getPrenom())) {
            errors.rejectValue("prenom", "Le prenom de l'employé(e) est obligatoire");
        }
        if (validatorDefinition.stringExceedsMax(employe.getPrenom(), 30)) {
            errors.rejectValue("prenom", "Le prenom de l'employé(e) ne doit pas dépasser 30 caractères");
        }
        if (validatorDefinition.charEmpty(employe.getSexe())) {
            errors.rejectValue("sexe", "Le sexe de l'employé(e) est obligatoire");
        }
        if (validatorDefinition.dateEmpty(employe.getDate_naissance())) {
            errors.rejectValue("date_naissance", "La date de naissance de l'employé(e) est obligatoire");
        }
        if (validatorDefinition.stringEmpty(employe.getCin())) {
            errors.rejectValue("cin", "Le CIN de l'employé(e) est obligatoire");
        }
        if (validatorDefinition.stringExceedsMax(employe.getCin(), 30)) {
            errors.rejectValue("cin", "Le CIN de l'employé(e) ne doit pas dépasser 10 caractères");
        }
        if (validatorDefinition.employeCinDuplicate(employe.getCin())) {
            errors.rejectValue("cin", "Le CIN est déja utilisé");
        }
        if(employe.getCompte_active()){
            if (validatorDefinition.stringEmpty(employe.getMot_de_passe())) {
                errors.rejectValue("mot_de_passe", "Le mot de passe de l'employé(e) est obligatoire");
            }
            if (validatorDefinition.stringBetween(employe.getMot_de_passe(), 8, 30)) {
                errors.rejectValue("mot_de_passe", "Le mot de passe de l'employé(e) doit être entre 8 et 30 caractères");
            }
    
            if(!validatorDefinition.stringEmpty(employe.getMot_de_passe())){
                employe.setMot_de_passe(passwordEncoder.encode(employe.getMot_de_passe()));
            }
        }
    }

}
