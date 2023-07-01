package com.cartegrise.cartgriseapi.v1.dtos;


import java.util.ArrayList;

import com.cartegrise.cartgriseapi.v1.models.Employe;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EmployeSearchResponse {
    ArrayList<Employe> employes;
}
