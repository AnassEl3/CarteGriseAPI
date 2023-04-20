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

    @Column(nullable = false)
    private String nom;

    @Column(nullable = false)
    private String prenom;

    @Column(nullable = false)
    private Character sexe;

    private Date date_naissance;
    private String lieu_naissance;

    @Column(nullable = false)
    private String cin;

    private String adresse;

    private String telephone;
}
