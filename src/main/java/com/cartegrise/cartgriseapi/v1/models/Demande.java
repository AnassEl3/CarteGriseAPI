package com.cartegrise.cartgriseapi.v1.models;

import java.sql.Date;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.PROTECTED)
    private Long id;

    @Column(nullable = false, length = 50)
    private String type;

    @Column(nullable = false)
    private Date date_demande = Date.valueOf(LocalDate.now());

    @Column(nullable = false)
    private String etat;
    
    private String description_etat;

    @Column(length = 10, unique = true)
    private String code;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="citoyen_fk")
    private Citoyen citoyen;
    
    @OneToMany
    private List<Document> documents = new ArrayList<>();
}
