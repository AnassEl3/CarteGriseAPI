package com.cartegrise.cartgriseapi.v1.models;

import java.sql.Date;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.AccessLevel;

@Entity
@Table(name = "employes")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Employe implements UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.PROTECTED)
    private Long id;
    
    @Column(nullable = false, length = 30)
    private String nom;

    @Column(nullable = false, length = 30)
    private String prenom;

    @Column(nullable = false, length = 1)
    private Character sexe;

    @Column(nullable = false)
    private Date date_naissance;

    @Column(nullable = false, length = 10, unique = true)
    private String cin;

    @Column(nullable = true)
    private String mot_de_passe;

    @Column(nullable = false)
    private Boolean compte_active = false;

    @ManyToOne
    @JoinColumn(name="administration_fk", columnDefinition = "bigint(20) default 1")
    private Administration administration;

    private Role role;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }
    @Override
    public String getPassword() {
        return mot_de_passe;
    }
    @Override
    public String getUsername() {
        return cin;
    }
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }
    @Override
    public boolean isEnabled() {
        return true;
    }
}
