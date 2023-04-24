package com.cartegrise.cartgriseapi.v1.dtos;

import java.util.Date;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
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
    @Size(max = 30, message = "Le nom de citoyen(ne) ne doit pas dépasser 30 caractères")
    private String nom;
    
    @NotBlank(message = "Le prénom de citoyen(ne) est obligatoire")
    @Size(max = 30, message = "Le prénom de citoyen(ne) ne doit pas dépasser 30 caractères")
    private String prenom;
    
    @NotBlank(message = "Le sexe de citoyen(ne) est obligatoire")
    @Size(max = 1, message = "Le sexe de citoyen(ne) ne doit pas dépasser 1 caractères")
    private Character sexe;
    
    @NotBlank(message = "Le date de naissance de citoyen(ne) est obligatoire")
    private Date date_naissance;
    
    @NotBlank(message = "Le lieu de naissance de citoyen(ne) est obligatoire")
    @Size(max = 10, message = "Le lieu de naissance de citoyen(ne) ne doit pas dépasser 10 caractères")
    private String lieu_naissance;
    
    @NotBlank(message = "Le CIN de citoyen(ne) est obligatoire")
    @Size(max = 10, message = "Le CIN de citoyen(ne) ne doit pas dépasser 10 caractères")
    private String cin;
    
    @NotBlank(message = "Le adresse de citoyen(ne) est obligatoire")
    private String adresse;
    
    @NotBlank(message = "Le telephone de citoyen(ne) est obligatoire")
    @Size(max = 15, message = "Le telephone de citoyen(ne) ne doit pas dépasser 15 caractères")
    private String telephone;
}
