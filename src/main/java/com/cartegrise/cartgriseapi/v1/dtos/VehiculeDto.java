package com.cartegrise.cartgriseapi.v1.dtos;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class VehiculeDto {
    
    private Long id;

    @NotBlank(message = "Le modèle de vehicule est obligatoire")
    private String modele;
    
    @NotBlank(message = "La marque de vehicule est obligatoire")
    private String marque;
    
    @NotBlank(message = "La carburant de vehicule est obligatoire")
    private String carburant;
    
    @NotBlank(message = "La puissance de vehicule est obligatoire")
    private String puissance;
    
    @NotBlank(message = "Le nombre dse places de vehicule est obligatoire")
    private Integer nb_place;
    
    @NotBlank(message = "Le nombre des cylindres de vehicule est obligatoire")
    private Integer nb_cylindres;
    
    private Double ptac;
}
