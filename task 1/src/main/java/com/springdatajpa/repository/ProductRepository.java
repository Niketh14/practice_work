package com.springdatajpa.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.springdatajpa.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> { List<Product> findBySalesId(int salesId); } 
