/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cursos.api.springsecuritycourse.config.security;


import org.springframework.context.annotation.*;
import org.springframework.security.authentication.*;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;


/**
 *
 * @author USER
 */
@Configuration
public class SecurityBeansInjector {
    
    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration) throws Exception{
        
        return authenticationConfiguration.getAuthenticationManager();
    }
    
    //Estrategia de autenticacion
    @Bean
    public AuthenticationProvider authenticationProvider(){
        
        DaoAuthenticationProvider authenticationStrategy = new DaoAuthenticationProvider();
        authenticationStrategy.setPasswordEncoder(null);
        authenticationStrategy.setUserDetailsService(null);
        
        return authenticationStrategy;
    }
    
}
