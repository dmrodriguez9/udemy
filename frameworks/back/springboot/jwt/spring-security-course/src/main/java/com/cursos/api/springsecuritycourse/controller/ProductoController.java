/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cursos.api.springsecuritycourse.controller;

import com.cursos.api.springsecuritycourse.dto.SaveProduct;
import com.cursos.api.springsecuritycourse.persistence.entity.Product;
import com.cursos.api.springsecuritycourse.service.ProductService;
import jakarta.validation.Valid;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;


/**
 *
 * @author USER
 */

@RestController
@RequestMapping("/products")
public class ProductoController {
    
    @Autowired
    private ProductService productService;
    
    @GetMapping
    public ResponseEntity<Page<Product>> findAll(Pageable pageable){
        
        Page<Product> productsPage = productService.findAll(pageable);
        
        if(productsPage.hasContent()){
            return ResponseEntity.ok(productsPage);
        }
        
        return ResponseEntity.notFound().build();
        
    }
    
    @GetMapping("/{productId}")
    public ResponseEntity<Product> findOneById(@PathVariable Long productId){
        
        Optional<Product> product = productService.findOneById(productId);
        
        if(product.isPresent()){
            return ResponseEntity.ok(product.get());
        }
        
        return ResponseEntity.notFound().build();
        
    }
    
    @PostMapping
    public ResponseEntity<Product> createOne(@RequestBody @Valid SaveProduct saveProduct){
        
       Product product = productService.createOne(saveProduct);
       return ResponseEntity.status(HttpStatus.CREATED).body(product);
        
    }
    
    @PutMapping("/{productId}")
    public ResponseEntity<Product> updateOneById(@PathVariable Long productId, @RequestBody @Valid SaveProduct saveProduct){
        
       Product product = productService.updateOneById(productId, saveProduct);
       return ResponseEntity.ok(product);
        
    }
    
     @PutMapping("/{productId}/disabled")
    public ResponseEntity<Product> disableOneById(@PathVariable Long productId){
        
       Product product = productService.disableOneById(productId);
       return ResponseEntity.ok(product);
        
    }
    
    
}
