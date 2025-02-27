package com.example.apps_empresariales.controller;

import com.example.apps_empresariales.entity.Product;
import com.example.apps_empresariales.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    /**
     * calls the class ProductService and use the annotation @Autowired; apply singleton in the class
     */
    @Autowired
    private ProductService productService;

    /**
     * calls the method getAllProduct of class ProductService
     * @return list of all products
     */
    @GetMapping("/allProducts")
    public List<Product> getAllProduct() {
        return productService.findAllProduct();
    }

    /**
     * calls the method findProductById of class ProductService
     * @param id of a product
     * @return product found by id
     */
    @GetMapping("/findProductById/{id}")
    public Optional<Product> getProductById(@PathVariable Long id) {
        return productService.findProductById(id);
    }

    /**
     * calls the method createProduct of class ProductService
     * @param product
     * @return new product whit a primery key
     */
    @PostMapping("/createProduct")
    public Product createProduct(@RequestBody Product product) {
        return productService.createProduct(product);
    }

    /**
     * calls the method updateProduct of class ProductService
     * @param product
     * @return product updated
     */
    @PutMapping("/updateProduct")
    public Product updateProduct(@RequestBody Product product) {
        return productService.updateProduct(product);
    }

    /**
     * calls the method deleteProduct of class ProductService
     * @param id
     */
    @DeleteMapping("/deleteProduct/{id}")
    public void deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
    }
}
