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
public class CarteGriseDto {

    private Long id;
    
    @NotBlank(message = "l'immartriculation de véhicule est obligatoire")
    @Size(max = 20, message = "L'immatriculation de carte grise ne doit pas dépasser 20 caractères")
    private String immatriculation;
    
    @Size(max = 20, message = "L'immatriculation anterieure de carte grise ne doit pas dépasser 20 caractères")
    private String immatriculation_anterieure;
    
    @NotBlank(message = "la date de prepière utilisation de véhicule est obligatoire")
    private Date date_premiere_utilisation;
    
    private Date date_mutation;
    
    @NotBlank(message = "la date de fin de validation de carte grise est obligatoire")
    private Date date_fin_validation;
    
    @Size(max = 20, message = "L'usage de véhicule ne doit pas dépasser 20 caractères")
    private String vehicule_usage;
}
