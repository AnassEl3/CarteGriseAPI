package com.cartegrise.cartgriseapi.v1.models;

import java.util.List;
import java.util.ArrayList;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.PROTECTED)
    private Long id;

    @Column(nullable = false, length = 50)
    private String nom;
    
    private String adresse;
    
    @Column(length = 15)
    private String telephone;
    
    @OneToMany
    private List<Employe> employees = new ArrayList<>();
}
