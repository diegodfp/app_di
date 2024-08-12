package com.app_di.app_di.services;

import com.app_di.app_di.models.Product;

public interface ProductService {
    Product findById(Long id);
    
}
