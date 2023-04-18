package com.cartegrise.cartgriseapi.models;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.AccessLevel;


@Entity
@Table(name = "demandes")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Demande {
    @Id
    @GeneratedValue
    @Setter(AccessLevel.PROTECTED)
    private Long id;

    private String type;
    private Date date_demande;
    private String etat;
    private String description_etat;

}
