package com.cartegrise.cartgriseapi.v1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.cartegrise.cartgriseapi.v1.models.Administration;
@CrossOrigin
@RepositoryRestResource(path = "administrations", collectionResourceRel = "administrations")
public interface AdministrationRepository extends JpaRepository<Administration, Long> {
    
}
