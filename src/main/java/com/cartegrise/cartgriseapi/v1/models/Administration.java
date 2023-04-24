package com.cartegrise.cartgriseapi.v1.models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
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

    @Column(nullable = false, length = 50)
    @NotNull(message = "Le champ Nom est obligatoire")
    private String nom;
    
    private String adresse;
    
    @Column(length = 15)
    private String telephone;

}
