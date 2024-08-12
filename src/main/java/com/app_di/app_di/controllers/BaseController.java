package com.app_di.app_di.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app_di.app_di.models.Product;
import com.app_di.app_di.services.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("/api")
public class BaseController {

        @Autowired
        private ProductService serviceProduct;

        @GetMapping("/{id}")
        public Product show(@PathVariable Long id) {
            return serviceProduct.findById(id);
        }
        
}
