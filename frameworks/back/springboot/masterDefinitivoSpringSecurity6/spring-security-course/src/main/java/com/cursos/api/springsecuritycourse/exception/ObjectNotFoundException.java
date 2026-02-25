/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cursos.api.springsecuritycourse.exception;

/**
 *
 * @author USER
 */

public class ObjectNotFoundException extends RuntimeException {
    
    public ObjectNotFoundException(){
       
    }
    
    public ObjectNotFoundException(String message){
        super(message);
        
    }
    
    public ObjectNotFoundException(String message, Throwable cause){
        super(message,cause);
    }
    
}
