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
public class VehiculeDto {
    
    private Long id;

    @NotBlank(message = "Le modèle de véhicule est obligatoire")
    @Size(max = 15, message = "Le modèle de véhicule ne doit pas dépasser 15 caractères")
    private String modele;
    
    @NotBlank(message = "La marque de véhicule est obligatoire")
    @Size(max = 15, message = "La marque de véhicule ne doit pas dépasser 15 caractères")
    private String marque;
    
    @NotBlank(message = "La carburant de véhicule est obligatoire")
    @Size(max = 15, message = "La carburant de véhicule ne doit pas dépasser 15 caractères")
    private String carburant;
    
    @NotBlank(message = "La puissance de véhicule est obligatoire")
    @Size(max = 15, message = "La puissance de véhicule ne doit pas dépasser 15 caractères")
    private String puissance;
    
    @NotBlank(message = "Le nombre de places de véhicule est obligatoire")
    private Integer nb_place;
    
    @NotBlank(message = "Le nombre des cylindres de véhicule est obligatoire")
    private Integer nb_cylindres;
    
    private Double ptac;
}
