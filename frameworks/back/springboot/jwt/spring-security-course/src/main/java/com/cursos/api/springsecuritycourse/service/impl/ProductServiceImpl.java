/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cursos.api.springsecuritycourse.service.impl;

import com.cursos.api.springsecuritycourse.dto.SaveProduct;
import com.cursos.api.springsecuritycourse.persistence.entity.Category;
import com.cursos.api.springsecuritycourse.persistence.entity.Product;
import com.cursos.api.springsecuritycourse.persistence.repository.ProductRepository;
import com.cursos.api.springsecuritycourse.service.ProductService;
import java.math.BigDecimal;
import java.util.Optional;
import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 *
 * @author USER
 */
@Service
public class ProductServiceImpl implements ProductService {
    
    @Autowired
    private ProductRepository productRepository;

    @Override
    public Page<Product> findAll(Pageable pageable) {
        return productRepository.findAll(pageable);
    }

    @Override
    public Optional<Product> findOneById(Long productId) {
        return productRepository.findById(productId);
    }

    @Override
    public Product createOne(SaveProduct saveProduct) {
        
        Product product = new Product();
        product.setName(saveProduct.getName());
        product.setPrice(saveProduct.getPrice());
        product.setStatus(Product.ProductStatus.ENABLED);
        
        Category category = new Category();
        category.setId(saveProduct.getCategoryId());
        product.setCategory(category);
        
        return productRepository.save(product);
    }

    @Override
    public Product updateOneById(Long productId, SaveProduct saveProduct) {
       
        Product productFromDB = productRepository.findById(productId)
                .orElseThrow( () -> new com.cursos.api.springsecuritycourse.exception
                        .ObjectNotFoundException("Product not found with id:" + " "+ productId));
        
        productFromDB.setName(saveProduct.getName());
        productFromDB.setPrice(saveProduct.getPrice());
  
        Category category = new Category();
        category.setId(saveProduct.getCategoryId());
        productFromDB.setCategory(category);
        
        return productRepository.save(productFromDB);
        
    }

    @Override
    public Product disableOneById(Long productId) {
         Product productFromDB = productRepository.findById(productId)
                .orElseThrow( () -> new com.cursos.api.springsecuritycourse.exception
                        .ObjectNotFoundException("Product not found with id:" + " "+ productId));
         productFromDB.setStatus(Product.ProductStatus.DISABLED);
         
         return productRepository.save(productFromDB);
    }
    
}
