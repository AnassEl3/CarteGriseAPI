package com.cartegrise.cartgriseapi.v1.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.cartegrise.cartgriseapi.v1.models.Administration;
@RepositoryRestResource(path = "administrations", collectionResourceRel = "administrations")
public interface AdministrationRepository extends CrudRepository<Administration, Long> {
    
}
