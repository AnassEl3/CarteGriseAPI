package com.cartegrise.cartgriseapi.models;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "citoyens")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Citoyen {
    @Id
    @GeneratedValue
    @Setter(AccessLevel.PROTECTED)
    private Long id;
    
    private String nom;
    private String prenom;
    private Character sexe;
    private Date date_naissance;
    private String lieu_naissance;
    private String cin;
    private String adresse;
    private String telephone;
}
