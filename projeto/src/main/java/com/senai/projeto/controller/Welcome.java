package com.senai.projeto.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController // atalho RC
@RequestMapping("/welcome") // atalho RM

public class Welcome {
    @RequestMapping

    public String  welcome() {
        return "Welcome to the Projeto Application!";
    }
    
    
}
