package com.cartegrise.cartgriseapi.models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.AccessLevel;


@Entity
@Table(name = "administrations")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Administration {
    @Id
    @GeneratedValue
    @Setter(AccessLevel.PROTECTED)
    private Long id;

    @Column(nullable = false)
    private String nom;

    private String adresse;
    
    private String telephone;

}
