/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cursos.api.springsecuritycourse.exception;

import com.cursos.api.springsecuritycourse.dto.ApiError;
import jakarta.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;


/**
 *
 * @author USER
 */
@RestControllerAdvice //Mapea errores
public class GlobalExceptionHandler {
    
    @ExceptionHandler(Exception.class)
    public ResponseEntity <?> handlerGenericException(HttpServletRequest request, Exception exception){
    
        ApiError apiError = new ApiError();
        apiError.setBackMessage(exception.getLocalizedMessage());
        apiError.setUrl(request.getRequestURL().toString());
        apiError.setMethod(request.getMethod());
        apiError.setTimestamp(LocalDateTime.now());
        apiError.setMessage("Error interno en el servidor, vuelva a intentarlo");
        
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(apiError);
    }
    
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity <?> handlerMethodArgumentNotValidException(HttpServletRequest request, MethodArgumentNotValidException exception){
    
        ApiError apiError = new ApiError();
        apiError.setBackMessage(exception.getLocalizedMessage());
        apiError.setUrl(request.getRequestURL().toString());
        apiError.setMethod(request.getMethod());
        apiError.setMessage("Error en la petición enviada");
        
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(apiError);
        
    
    }
}
