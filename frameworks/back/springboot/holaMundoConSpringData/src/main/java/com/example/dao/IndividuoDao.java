/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.dao;

import com.example.domain.Individuo;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Usuario
 */

public interface IndividuoDao extends CrudRepository<Individuo, Long>{
    
}
