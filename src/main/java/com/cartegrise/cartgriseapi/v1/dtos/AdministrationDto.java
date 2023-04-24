package com.cartegrise.cartgriseapi.v1.dtos;

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
public class AdministrationDto {

    private Long id;

    @NotBlank(message = "Le nom de l'administration est obligatoire")
    @Size(max = 50, message = "Le nom de l'administration ne doit pas dépasser 50 caractères")
    private String nom;
    
    private String adresse;
    
    private String telephone;
}
