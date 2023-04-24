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
public class DocumentDto {

    private Long id;

    @NotBlank(message = "Le nom de document est obligatoire")
    @Size(max = 50, message = "Le nom du document ne doit pas dépasser 50 caractères")
    private String nom;
    
    @NotBlank(message = "Le chemain de document est obligatoire")
    private String chemain;
}
