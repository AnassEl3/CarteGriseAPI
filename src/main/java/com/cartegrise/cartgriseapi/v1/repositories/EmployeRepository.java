package com.cartegrise.cartgriseapi.v1.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.cartegrise.cartgriseapi.v1.models.Employe;

@RepositoryRestResource(path = "employes", collectionResourceRel = "employes")
public interface EmployeRepository extends CrudRepository<Employe, Long> {
    Optional<Employe> findByCin(String cin);
}
