package com.springdatajpa.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.springdatajpa.entity.Sale;

public interface SalesRepository extends JpaRepository<Sale, Long> { Optional<Sale> findById(int id); } 