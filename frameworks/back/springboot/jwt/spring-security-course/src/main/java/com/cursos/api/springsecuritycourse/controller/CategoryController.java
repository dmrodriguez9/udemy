/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cursos.api.springsecuritycourse.controller;

import com.cursos.api.springsecuritycourse.dto.SaveCategory;
import com.cursos.api.springsecuritycourse.persistence.entity.Category;
import com.cursos.api.springsecuritycourse.service.CategoryService;
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
@RequestMapping("/categories")
public class CategoryController {
    
    @Autowired
    private CategoryService categoryService;
    
    @GetMapping
    public ResponseEntity<Page<Category>> findAll(Pageable pageable){
        
        Page<Category> categoriesPage = categoryService.findAll(pageable);
        
        if(categoriesPage.hasContent()){
            return ResponseEntity.ok(categoriesPage);
        }
        
        return ResponseEntity.notFound().build();
        
    }
    
    @GetMapping("/{categoryId}")
    public ResponseEntity<Category> findOneById(@PathVariable Long categoryId){
        
        Optional<Category> category = categoryService.findOneById(categoryId);
        
        if(category.isPresent()){
            return ResponseEntity.ok(category.get());
        }
        
        return ResponseEntity.notFound().build();
        
    }
    
    @PostMapping
    public ResponseEntity<Category> createOne(@RequestBody @Valid SaveCategory saveCategory){
        
       Category category = categoryService.createOne(saveCategory);
       return ResponseEntity.status(HttpStatus.CREATED).body(category);
        
    }
    
      @PutMapping("/{categoryId}")
    public ResponseEntity<Category> updateOneById(@PathVariable Long categoryId, @RequestBody @Valid SaveCategory saveCategory){
        
       Category category = categoryService.updateOneById(categoryId, saveCategory);
       return ResponseEntity.ok(category);
        
    }
    
     @PutMapping("/{categoryId}/disabled")
    public ResponseEntity<Category> disableOneById(@PathVariable Long categoryId){
        
       Category category = categoryService.disableOneById(categoryId);
       return ResponseEntity.ok(category);
        
    }
    
    
}
