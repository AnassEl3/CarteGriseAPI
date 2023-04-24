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
public class DemandeDto {
 
    private Long id;

    @NotBlank(message = "Le type de demande est obligatoire")
    private String type;

    @NotBlank(message = "La date de demande est obligatoire")
    private Date date_demande;

    @NotBlank(message = "L'etat de demande est obligatoire")
    private String etat;
    
    private String description_etat;
}
