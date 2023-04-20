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
@Table(name = "cartesgrise")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CarteGrise {
    @Id
    @GeneratedValue
    @Setter(AccessLevel.PROTECTED)
    private Long id;
    
    @Column(nullable = false)
    private String immatriculation;

    private String immatriculation_anterieure;

    @Column(nullable = false)
    private Date date_premiere_utilisation;

    private Date date_mutation;

    @Column(nullable = false)
    private Date date_fin_validation;
    
    private String vehicule_usage;
}
