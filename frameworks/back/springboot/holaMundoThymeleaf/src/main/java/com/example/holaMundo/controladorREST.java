/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.holaMundo;


import com.example.domain.Individuo;
import java.util.ArrayList;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Usuario
 */
@Controller
@Slf4j
public class controladorREST {
    
    @Value("${indice.hola}")
    private String hola2;
    
    @GetMapping("/")
    public String comienzo (Model modelo){
        String hola = "Mi amor bonito Nayeli jiji";
        //Creacion del objeto individuo
        Individuo indi = new Individuo();
        indi.setNombre("Danny");
        indi.setApellido("Rodriguez");
        indi.setEdad(28);
        indi.setTelefono("123456789");
        indi.setCorreo("danny@.com");
        
        //Creacion del objeto individuo2
        Individuo indi2 = new Individuo();
        indi2.setNombre("Nayeli");
        indi2.setApellido("Tipantiza");
        indi2.setEdad(23);
        indi2.setTelefono("173456789");
        indi2.setCorreo("naye@.com");
        
        
        ArrayList<Individuo> individuos= new ArrayList();
        individuos.add(indi);
        individuos.add(indi2);
        
        //Agregacion al modelo
        modelo.addAttribute("hola",hola);
        modelo.addAttribute("hola2", hola2);
        modelo.addAttribute("indi", indi);
        modelo.addAttribute("individuos", individuos);
        return "indice";
    }
    
}
