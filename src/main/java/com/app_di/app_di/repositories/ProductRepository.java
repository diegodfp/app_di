package com.app_di.app_di.repositories;

import com.app_di.app_di.models.Product;

public interface ProductRepository {

    Product findById(Long id);
    
}
