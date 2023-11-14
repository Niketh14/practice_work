package com.springdatajpa.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springdatajpa.entity.Product;
import com.springdatajpa.entity.Sale;
import com.springdatajpa.repository.ProductRepository;
import com.springdatajpa.repository.SalesRepository;
import com.springdatajpa.service.SalesService;

@Service
public class SalesServiceImpl implements SalesService {

    private final SalesRepository salesRepository;
    private final ProductRepository productRepository;

    @Autowired
    public SalesServiceImpl(SalesRepository salesRepository, ProductRepository productRepository) {
        this.salesRepository = salesRepository;
        this.productRepository = productRepository;
    }

    @Override
    public Optional<Sale> getSalesById(Long id) {
        return salesRepository.findById(id);
    }

    public Optional<Sale> getSalesById(int id) {
        // You need to implement this method based on your use case.
        // If you're using an ID of type int, you may need to convert it to Long and then call findById.
        // For example:
        // return salesRepository.findById((long) id);
        return Optional.empty();
    }

    public List<Product> getAllProductsBySalesId(int salesId) {
        return productRepository.findBySalesId(salesId);
    }

	@Override
	public List<Product> getAllProductsBySalesId(Long salesId) {
		// TODO Auto-generated method stub
		return null;
	}
}
