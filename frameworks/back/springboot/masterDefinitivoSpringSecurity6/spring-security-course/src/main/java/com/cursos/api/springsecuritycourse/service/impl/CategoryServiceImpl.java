/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cursos.api.springsecuritycourse.service.impl;

import com.cursos.api.springsecuritycourse.dto.SaveCategory;
import com.cursos.api.springsecuritycourse.dto.SaveProduct;
import com.cursos.api.springsecuritycourse.persistence.entity.Category;
import com.cursos.api.springsecuritycourse.persistence.entity.Product;
import com.cursos.api.springsecuritycourse.persistence.repository.CategoryRepository;
import com.cursos.api.springsecuritycourse.persistence.repository.ProductRepository;
import com.cursos.api.springsecuritycourse.service.CategoryService;
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
public class CategoryServiceImpl implements CategoryService {
    
    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public Page<Category> findAll(Pageable pageable) {
        return categoryRepository.findAll(pageable);
    }

    @Override
    public Optional<Category> findOneById(Long categoryId) {
        return categoryRepository.findById(categoryId);
    }

    @Override
    public Category createOne(SaveCategory saveCategory) {
        
        Category category = new Category();
        category.setName(saveCategory.getName());
        category.setStatus(Category.CategoryStatus.ENABLED);
        
        return categoryRepository.save(category);
    }

    @Override
    public Category updateOneById(Long categoryId, SaveCategory saveCategory) {
       
        Category categoryFromDB = categoryRepository.findById(categoryId)
                .orElseThrow( () -> new com.cursos.api.springsecuritycourse
                        .exception.ObjectNotFoundException("Category not found with id: " +" "+ categoryId));
        categoryFromDB.setName(saveCategory.getName());
       
        return categoryRepository.save(categoryFromDB);
        
    }

    @Override
    public Category disableOneById(Long categoryId) {
         Category categoryFromDB = categoryRepository.findById(categoryId)
                .orElseThrow( () -> new com.cursos.api.springsecuritycourse
                        .exception.ObjectNotFoundException("Category not found with id: " +" "+ categoryId));
         categoryFromDB.setStatus(Category.CategoryStatus.DISABLED);
         
         return categoryRepository.save(categoryFromDB);
    }

   

}
