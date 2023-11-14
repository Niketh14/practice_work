package com.springdatajpa.controller;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springdatajpa.entity.Product;
import com.springdatajpa.entity.Sale;
import com.springdatajpa.service.ProductService;
import com.springdatajpa.service.SalesService;

@RestController
@RequestMapping("/sales")
public class SalesController {

    private final SalesService salesService;
    private final ProductService productService;

    @Autowired
    public SalesController(SalesService salesService, ProductService productService) {
        this.salesService = salesService;
        this.productService = productService;
    }

    @GetMapping("/{salesId}")
    public ResponseEntity<?> getSalesDetails(@PathVariable Long salesId) {
        Optional<Sale> sales = salesService.getSalesById(salesId);
        if (sales.isPresent()) {
            List<Product> products = ((SalesService) productService).getAllProductsBySalesId(salesId);
            sales.get().setProducts(new HashSet<>(products)); // Assuming Sale entity has a Set<Product> field
            return new ResponseEntity<>(sales.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Sales not found", HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/{salesId}/products")
    public ResponseEntity<?> getAllProductsBySalesId(@PathVariable Long salesId) {
        List<Product> products = ((SalesService) productService).getAllProductsBySalesId(salesId);
        return new ResponseEntity<>(products, HttpStatus.OK);
    }
}



