package com.cartegrise.cartgriseapi.models;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "citoyens")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Citoyen {
    @Id
    @GeneratedValue
    @Setter(AccessLevel.PROTECTED)
    private Long id;

    @Column(nullable = false, length = 30)
    private String nom;

    @Column(nullable = false, length = 30)
    private String prenom;

    @Column(nullable = false, length = 1)
    private Character sexe;
    
    private Date date_naissance;
    
    @Column(nullable = false, length = 10)
    private String lieu_naissance;

    @Column(nullable = false, length = 10, unique = true)
    private String cin;
    
    private String adresse;
    
    @Column(length = 15)
    private String telephone;
}
