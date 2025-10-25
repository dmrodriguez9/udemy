/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.cursos.api.springsecuritycourse.persistence.entity.util;


import java.util.Arrays;
import java.util.List;



/**
 *
 * @author USER
 */


public enum Role {
    
    ROLE_ADMINISTRATOR (Arrays.asList(
    RolePermission.READ_ALL_PRODUCTS,
    RolePermission.READ_ONE_PRODUCT,
    RolePermission.CREATE_ONE_PRODUCT,
    RolePermission.UPDATE_ONE_PRODUCT,
    RolePermission.DISABLE_ONE_PRODUCT,
    
    RolePermission.READ_ALL_CATEGORIES,
    RolePermission.READ_ONE_CATEGORY,
    RolePermission.CREATE_ONE_CATEGORY,
    RolePermission.UPDATE_ONE_CATEGORY,
    RolePermission.DISABLE_ONE_PRODUCT,
    
    RolePermission.READ_MY_PROFILE
            
    )),
    
    ROLE_ASSISTANT_ADMINISTRATOR(Arrays.asList(
            
    RolePermission.READ_ALL_PRODUCTS,
    RolePermission.READ_ONE_PRODUCT,
    RolePermission.UPDATE_ONE_PRODUCT,
   
    RolePermission.READ_ALL_CATEGORIES,
    RolePermission.READ_ONE_CATEGORY,
    RolePermission.UPDATE_ONE_CATEGORY,
    
    RolePermission.READ_MY_PROFILE
     
            
    )),
    ROLE_CUSTOMER (Arrays.asList(
    
    RolePermission.READ_MY_PROFILE
            
    ));
    
    //Atributos
    
    private List<RolePermission> permissions;
    
    Role(List<RolePermission> permissions){
        this.permissions=permissions;
    }
    
    //Getters y Setters

    public List<RolePermission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<RolePermission> permissions) {
        this.permissions = permissions;
    }
    
    
    
   
    
}
