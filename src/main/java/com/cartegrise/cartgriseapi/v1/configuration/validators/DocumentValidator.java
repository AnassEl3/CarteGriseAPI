package com.cartegrise.cartgriseapi.v1.configuration.validators;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.cartegrise.cartgriseapi.v1.configuration.ValidatorDefinition;
import com.cartegrise.cartgriseapi.v1.models.Document;

public class DocumentValidator implements Validator{
    
    @Autowired
    ValidatorDefinition validatorDefinition;

    @Override
    public boolean supports(Class<?> clazz) {
        return Document.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Document document = (Document) target;
        if (validatorDefinition.stringEmpty(document.getNom())) {
            errors.rejectValue("nom", "Le nom de document est obligatoire");
        }
        if (validatorDefinition.stringExceedsMax(document.getNom(), 50)) {
            errors.rejectValue("nom", "Le nom deu document ne doit pas dépasser 50 caractères");
        }
        if (validatorDefinition.stringEmpty(document.getChemain())) {
            errors.rejectValue("chemain", "Le chemain de document est obligatoire");
        }
    }
}
