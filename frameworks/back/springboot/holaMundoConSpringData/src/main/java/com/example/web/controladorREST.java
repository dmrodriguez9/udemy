/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.web;




import com.example.dao.IndividuoDao;
import com.example.domain.Individuo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
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
    
    @Autowired
    private IndividuoDao individuoDao;
    
    @GetMapping("/")
    public String comienzo (Model modelo){
       
       Iterable<Individuo> individuos = individuoDao.findAll();
       modelo.addAttribute("individuos", individuos);
        return "indice";
    }
    
}
