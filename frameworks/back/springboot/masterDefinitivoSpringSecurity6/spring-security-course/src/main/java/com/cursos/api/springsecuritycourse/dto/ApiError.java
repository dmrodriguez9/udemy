/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cursos.api.springsecuritycourse.dto;

import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 *
 * @author USER
 */
@Data
public class ApiError implements Serializable {
    
    //Atributos
    private String backMessage;
    private String message;
    private LocalDateTime timestamp;
    private String url;
    private String method;
    
    
}
