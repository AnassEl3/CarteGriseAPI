package com.cartegrise.cartgriseapi.v1.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EmployeSearchRequest {
    String prenom;
    String nom;
    String cin;
}
