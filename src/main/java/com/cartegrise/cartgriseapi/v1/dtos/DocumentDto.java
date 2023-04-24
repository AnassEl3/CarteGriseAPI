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
public class DocumentDto {

    private Long id;

    @NotBlank(message = "Le nom de document est obligatoire")
    private String nom;
    
    @NotBlank(message = "Le chemain de document est obligatoire")
    private String chemain;
}
