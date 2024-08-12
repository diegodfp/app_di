package com.app_di.app_di.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app_di.app_di.models.Product;
import com.app_di.app_di.repositories.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository repositoryProduct;


    public Product findById(Long id) {
        return repositoryProduct.findById(id);
    }

    

}
