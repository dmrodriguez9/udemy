/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.cursos.api.springsecuritycourse.service;

import com.cursos.api.springsecuritycourse.dto.SaveProduct;
import com.cursos.api.springsecuritycourse.persistence.entity.Product;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 *
 * @author USER
 */
public interface ProductService {

    public Page<Product> findAll(Pageable pageable);

    public Optional<Product> findOneById(Long productId);

    public Product createOne(SaveProduct saveProduct);

    public Product updateOneById(Long productId, SaveProduct saveProduct);

    public Product disableOneById(Long productId);

   
    
}
