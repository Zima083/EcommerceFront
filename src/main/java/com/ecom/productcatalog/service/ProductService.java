package com.ecom.productcatalog.service;

import com.ecom.productcatalog.model.product;
import com.ecom.productcatalog.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    public List<product> getAllProducts(){
        return productRepository.findAll();
    }

    public List<product> getProductbyCategory(long categoryId){
        return productRepository.findByCategoryId(categoryId);
    }
}
