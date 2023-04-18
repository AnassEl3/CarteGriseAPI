package com.cartegrise.cartgriseapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.cartegrise.cartgriseapi.models.Administration;

@RepositoryRestResource
public interface AdministrationRepository extends JpaRepository<Administration, Long> {
    
}
