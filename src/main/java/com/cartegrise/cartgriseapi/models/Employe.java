package com.cartegrise.cartgriseapi.models;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.AccessLevel;

@Entity
@Table(name = "employes")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Employe {
    @Id
    @GeneratedValue
    @Setter(AccessLevel.PROTECTED)
    private Long id;
    
    private String nom;
    private String prenom;
    private Date date_naissance;
    private String cin;
    private String mot_de_passe;
}
