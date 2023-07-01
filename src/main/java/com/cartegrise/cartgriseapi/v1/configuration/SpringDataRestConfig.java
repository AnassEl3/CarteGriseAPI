package com.cartegrise.cartgriseapi.v1.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

import com.cartegrise.cartgriseapi.v1.models.Administration;
import com.cartegrise.cartgriseapi.v1.models.CarteGrise;
import com.cartegrise.cartgriseapi.v1.models.Citoyen;
import com.cartegrise.cartgriseapi.v1.models.Demande;
import com.cartegrise.cartgriseapi.v1.models.Document;
import com.cartegrise.cartgriseapi.v1.models.Employe;
import com.cartegrise.cartgriseapi.v1.models.Vehicule;

@Configuration
public class SpringDataRestConfig implements RepositoryRestConfigurer {
    
    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
        // Add id field to responses
        config.exposeIdsFor(
            Administration.class, 
            Employe.class,
            Demande.class,
            Document.class,
            Citoyen.class,
            CarteGrise.class,
            Vehicule.class
            );
    }
}
