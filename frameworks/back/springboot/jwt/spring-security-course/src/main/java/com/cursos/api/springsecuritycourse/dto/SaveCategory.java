/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cursos.api.springsecuritycourse.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 *
 * @author USER
 */

@Data
public class SaveCategory implements Serializable {
    
    @NotBlank
    private String name;
    @DecimalMin(value="0.01")
    
    private BigDecimal price;
    @Min(value=1)
    
    private Long categoryId;
    
}
