package com.cartegrise.cartgriseapi.v1.configuration;

import java.sql.Date;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.cartegrise.cartgriseapi.v1.models.Employe;
import com.cartegrise.cartgriseapi.v1.repositories.EmployeRepository;

@Component
public class DatabaseLoader  implements ApplicationRunner {

    @Autowired
    EmployeRepository employeRepository;
    
    @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        employeRepository.save(
            Employe.builder()
                .nom("El yaagoubi")
                .prenom("Anass")
                .sexe('m')
                .date_naissance(new Date(new SimpleDateFormat("dd/MM/yyyy").parse("04/03/2001").getTime()))
                .cin("cd25665")
                .mot_de_passe(passwordEncoder.encode("12345678"))
                .build()
        );
    }
    
}
