/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cursos.api.springsecuritycourse.persistence.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import lombok.Data;

/**
 *
 * @author USER
 */

@Entity
@Data
public class Product {
    
    //Atributos
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private BigDecimal price;
    @Enumerated(EnumType.STRING)
    private ProductStatus status;
    
    @ManyToOne
    @JoinColumn(name="category_id")
    private Category category;
    
    public static enum ProductStatus{
        ENABLED, DISABLED;
    }
    
    
}
