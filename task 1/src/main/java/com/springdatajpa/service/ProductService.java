package com.springdatajpa.service;

import com.springdatajpa.entity.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final CrudRepository productRepository;

    @Autowired
    public ProductService(CrudRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts() {
        return (List<Product>) productRepository.findAll();
    }

    public Product getProductById(Long productId) {
        Optional<Product> product = productRepository.findById(productId);
        return product.orElse(null);
    }

    public Product saveProduct(Product product) {
        return (Product) productRepository.save(product);
    }

    public void deleteProduct(Long productId) {
        productRepository.deleteById(productId);
    }
}
