package com.cartegrise.cartgriseapi.v1.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.cartegrise.cartgriseapi.v1.models.Citoyen;

@RepositoryRestResource(path = "citoyens", collectionResourceRel = "citoyens")
public interface CitoyenRepository extends CrudRepository<Citoyen, Long> {
    Optional<Citoyen> findByCin(String cin);
}
