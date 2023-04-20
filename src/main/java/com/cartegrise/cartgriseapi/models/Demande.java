package com.cartegrise.cartgriseapi.models;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.AccessLevel;


@Entity
@Table(name = "demandes")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Demande {
    @Id
    @GeneratedValue
    @Setter(AccessLevel.PROTECTED)
    private Long id;

    @Column(nullable = false)
    private String type;

    @Column(nullable = false)
    private Date date_demande;

    @Column(nullable = false)
    private String etat;
    
    private String description_etat;

}
