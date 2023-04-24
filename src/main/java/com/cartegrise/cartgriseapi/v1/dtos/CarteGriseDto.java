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
public class CarteGriseDto {

    private Long id;
    
    @NotBlank(message = "l'immartriculation de vehicule est obligatoire")
    private String immatriculation;
    
    private String immatriculation_anterieure;
    
    @NotBlank(message = "la date de prepière utilisation de vehicule est obligatoire")
    private Date date_premiere_utilisation;
    
    private Date date_mutation;
    
    @NotBlank(message = "la date de fin de validation de carte grise est obligatoire")
    private Date date_fin_validation;
    
    private String vehicule_usage;
}
