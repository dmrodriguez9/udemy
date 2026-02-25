/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.cursos.api.springsecuritycourse.service;

import com.cursos.api.springsecuritycourse.dto.SaveCategory;
import com.cursos.api.springsecuritycourse.persistence.entity.Category;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 *
 * @author USER
 */
public interface CategoryService {

    public Page<Category> findAll(Pageable pageable);

    public Optional<Category> findOneById(Long categoryId);

    public Category createOne(SaveCategory saveCategory);

    public Category updateOneById(Long categoryId, SaveCategory saveCategory);

    public Category disableOneById(Long categoryId);
    
}
