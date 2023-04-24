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
public class EmployeDto {
    
    private Long id;
    
    @NotBlank(message = "Le nom de l'employé(e) est obligatoire")
    @Size(max = 30, message = "Le nom de l'employé(e) ne doit pas dépasser 30 caractères")
    private String nom;

    @NotBlank(message = "Le prénom de l'employé(e) est obligatoire")
    @Size(max = 30, message = "Le prénom de l'employé(e) ne doit pas dépasser 30 caractères")
    private String prenom;
    
    @NotBlank(message = "La date de naissance de l'employé(e) est obligatoire")
    private Date date_naissance;
    
    @NotBlank(message = "Le CIN de l'employé(e) est obligatoire")
    @Size(max = 10, message = "Le CIN de l'employé(e) ne doit pas dépasser 10 caractères")
    private String cin;
    
    @NotBlank(message = "Le mot de passe de l'employé(e) est obligatoire")
    @Size(min = 8, max = 30, message = "Le mot de passe de l'employé(e) doit être entre 8 et 30 caractères")
    private String mot_de_passe;
}
