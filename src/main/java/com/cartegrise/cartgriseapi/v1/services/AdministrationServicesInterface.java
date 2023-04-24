package com.cartegrise.cartgriseapi.v1.services;

import java.util.List;

import com.cartegrise.cartgriseapi.v1.models.Administration;

public interface AdministrationServicesInterface {
    public List<Administration> findAll();
    public Administration add(Administration administration);
    public Administration edit(Administration administration);
    public Administration delete(Administration administration);
}
