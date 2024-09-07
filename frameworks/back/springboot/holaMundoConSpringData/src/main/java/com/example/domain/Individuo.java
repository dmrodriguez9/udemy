/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.domain;


import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

/**
 *
 * @author Usuario
 */
@Data
@Entity
@Table(name="individuo")
public class Individuo implements Serializable{
    
    private static final long serialVersionUID= 1L;
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    //Atributos 
    private Long idindividuo;
    private String nombre;
    private String apellido;
    private int edad;
    private String telefono;
    private String correo;
    
     
}
