package com.cartegrise.cartgriseapi.v1.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.PROTECTED)
    private Long id;

    @Column(nullable = false, length = 15)
    private String modele;

    @Column(nullable = false, length = 15)
    private String marque;

    @Column(nullable = false, length = 15)
    private String carburant;
    
    @Column(nullable = false, length = 15)
    private String puissance;

    @Column(nullable = false)
    private Integer nb_place;

    @Column(nullable = false)
    private Integer nb_cylindres;
    
    private Double ptac;

    @OneToOne
    @JoinColumn(name = "cartegise_fk")
    CarteGrise carteGrise;
}
