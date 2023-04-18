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
@Table(name = "cartesgrise")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CarteGrise {
    @Id
    @GeneratedValue
    @Setter(AccessLevel.PROTECTED)
    private Long id;
    
    private String immatriculation;
    private String immatriculation_anterieure;
    private Date date_premiere_utilisation;
    private Date date_mutation;
    private Date date_fin_validation;
    private String vehicule_usage;
}
