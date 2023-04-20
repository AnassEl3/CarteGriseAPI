package com.cartegrise.cartgriseapi.models;

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
@Table(name = "vehicules")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Vehicule {
    @Id
    @GeneratedValue
    @Setter(AccessLevel.PROTECTED)
    private Long id;

    @Column(nullable = false)
    private String modele;

    @Column(nullable = false) 
    private String marque;

    @Column(nullable = false)
    private String carburant;
        
    private String puissance;

    @Column(nullable = false)
    private Integer nb_place;

    @Column(nullable = false)
    private Integer nb_cylindres;
    
    private Double ptac;
}
