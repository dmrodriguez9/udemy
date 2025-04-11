/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cursos.api.springsecuritycourse.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;

/**
 *
 * @author USER
 */

@Entity
@Data
public class Category {
    
    //Atributos
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Enumerated(EnumType.STRING)
    private CategoryStatus status;
    
    public static enum CategoryStatus{
        ENABLED, DISABLED;
    }
    
}
