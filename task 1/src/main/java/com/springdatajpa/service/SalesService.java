package com.springdatajpa.service;


import java.util.List;
import java.util.Optional;

import com.springdatajpa.entity.Product;
import com.springdatajpa.entity.Sale;


public interface SalesService 
{ Optional<Sale> getSalesById(Long id); 
List<Product> getAllProductsBySalesId(Long salesId); 
}
