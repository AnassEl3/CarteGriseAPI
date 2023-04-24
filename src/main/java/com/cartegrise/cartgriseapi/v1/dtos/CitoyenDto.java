package com.cartegrise.cartgriseapi.v1.dtos;

import java.util.Date;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CitoyenDto {

    private Long id;

    @NotBlank(message = "Le nom de citoyen(ne) est obligatoire")
    private String nom;
    
    @NotBlank(message = "Le prénom de citoyen(ne) est obligatoire")
    private String prenom;
    
    @NotBlank(message = "Le sexe de citoyen(ne) est obligatoire")
    private Character sexe;
    
    @NotBlank(message = "Le date de naissance de citoyen(ne) est obligatoire")
    private Date date_naissance;
    
    @NotBlank(message = "Le lieu de naissance de citoyen(ne) est obligatoire")
    private String lieu_naissance;
    
    @NotBlank(message = "Le CIN de citoyen(ne) est obligatoire")
    private String cin;
    
    @NotBlank(message = "Le adresse de citoyen(ne) est obligatoire")
    private String adresse;
    
    @NotBlank(message = "Le telephone de citoyen(ne) est obligatoire")
    private String telephone;
}
