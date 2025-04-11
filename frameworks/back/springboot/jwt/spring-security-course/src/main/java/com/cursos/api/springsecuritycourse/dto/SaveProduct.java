/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cursos.api.springsecuritycourse.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 *
 * @author USER
 */

@Data
public class SaveProduct implements Serializable{
    
    //Atributos
    
    private String name;
    private BigDecimal price;
    private Long categoryId;
    
}
