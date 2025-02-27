package com.example.apps_empresariales.service;

import com.example.apps_empresariales.entity.Product;
import com.example.apps_empresariales.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    /**
     * calls the class ProductRepository and use the annotation @Autowired; apply singleton in the class
     */
    @Autowired
    private ProductRepository productRepository;

    /**
     * calls the method getAllProduct of class ProductService
     * @return list of all products
     */
    public List<Product> findAllProduct() {
        return productRepository.findAll();
    }

    /**
     * calls the method findById of class ProductRepository; contains methods of JPA
     * @param id of a product
     * @return product found by id
     */
    public Optional<Product> findProductById(Long id) {
        return productRepository.findById(id);
    }

    /**
     * calls the method save of class ProductRepository; contains methods of JPA
     * @param product
     * @return new product whit a primery key
     */
    public Product createProduct( Product product) {
        return productRepository.save(product);
    }

    /**
     * calls the method save of class ProductRepository; contains methods of JPA
     * @param product
     * @return product updated
     */
    public Product updateProduct(Product product) {
        return productRepository.save(product);
    }

    /**
     * calls the method deleteById of class ProductRepository; contains methods of JPA
     * @param id
     */
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}
