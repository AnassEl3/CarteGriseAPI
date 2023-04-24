package com.cartegrise.cartgriseapi.v1.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cartegrise.cartgriseapi.v1.models.Employe;

public interface EmployeRepository extends JpaRepository<Employe, Long> {
    Optional<Employe> findByCin(String cin);
}
