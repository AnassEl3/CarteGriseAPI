package com.cartegrise.cartgriseapi.v1.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cartegrise.cartgriseapi.v1.models.Administration;
import com.cartegrise.cartgriseapi.v1.repositories.AdministrationRepository;

@Service
public class AdministrationServices implements AdministrationServicesInterface {

    @Autowired
    AdministrationRepository administrationRepository;

    @Override
    public List<Administration> findAll() {
        return administrationRepository.findAll();
    }

    @Override
    public Administration add(Administration administration) {
        return administrationRepository.save(administration);
    }

    @Override
    public Administration edit(Administration administration) {
        return null;
    }

    @Override
    public Administration delete(Administration administration) {
        return null;
    }
    


}
