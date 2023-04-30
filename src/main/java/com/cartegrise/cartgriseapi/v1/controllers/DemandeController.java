package com.cartegrise.cartgriseapi.v1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemandeController {
    @GetMapping("/test")
    private String test(){
        return "working ...";
    }
}
