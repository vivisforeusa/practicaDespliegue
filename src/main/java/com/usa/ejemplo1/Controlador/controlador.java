package com.usa.ejemplo1.Controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Ejemplo1")
public class controlador {

    @GetMapping("/mensaje")
    public String mensaje(){
     return "<h1>Enviando Mensaje de Bienvenida.....</h1>";
    }
}
