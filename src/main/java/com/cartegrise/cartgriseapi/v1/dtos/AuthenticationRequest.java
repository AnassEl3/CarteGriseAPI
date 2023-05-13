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
public class AuthenticationRequest {
    @NotBlank(message = "Le CIN est obligatoire")
    @Size(max = 10, message = "Le CIN ne doit pas dépasser 10 caractères")
    private String cin;
    @NotBlank(message = "Le mot de passe est obligatoire")
    @Size(min = 8, max = 30, message = "Le mot de passe doit être entre 8 et 30 caractères")
    private String mot_de_passe;
    private boolean remember_me;
}
