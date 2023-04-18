package com.cartegrise.cartgriseapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.cartegrise.cartgriseapi.models.Citoyen;

@RepositoryRestResource
public interface CitoyenRepository extends JpaRepository<Citoyen, Long> {
    
}
