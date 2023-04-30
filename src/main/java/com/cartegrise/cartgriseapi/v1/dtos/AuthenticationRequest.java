package com.cartegrise.cartgriseapi.v1.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AuthenticationRequest {
    private String cin;
    private String mot_de_passe;
    private boolean remember_me;
}
