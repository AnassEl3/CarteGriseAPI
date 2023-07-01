package com.cartegrise.cartgriseapi.v1.repositories;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.cartegrise.cartgriseapi.v1.models.Employe;

@CrossOrigin
@RepositoryRestResource(path = "employes", collectionResourceRel = "employes")
public interface EmployeRepository extends JpaRepository<Employe, Long> {
    // @RestResource(path = "byCin", rel = "customFindMethod")
    Optional<Employe> findByCin(@Param("cin") String cin);

    @Query(value = "SELECT * FROM employes e WHERE e.prenom LIKE %:prenom% OR e.nom LIKE %:nom% OR e.cin LIKE %:cin%", nativeQuery = true)
    Page<Employe> findByPrenomNomCin(
        @Param("prenom") String prenom,
        @Param("nom") String nom,
        @Param("cin") String cin,
        Pageable page);
}
