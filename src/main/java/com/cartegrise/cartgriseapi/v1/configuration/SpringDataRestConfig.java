package com.cartegrise.cartgriseapi.v1.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@Configuration
public class SpringDataRestConfig implements RepositoryRestConfigurer {
    // @Override
    // public void configureRepositoryRestConfiguration(
    //         RepositoryRestConfiguration config, CorsRegistry cors) {

    //     cors.addMapping("/*")
    //             .allowedOrigins("*")
    //             .allowedMethods("GET", "PUT", "PATCH", "DELETE")
    //             .allowCredentials(true).maxAge(3600);
    // }
}
