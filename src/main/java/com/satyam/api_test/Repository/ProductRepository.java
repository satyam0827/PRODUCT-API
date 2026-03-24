package com.satyam.api_test.Repository;

import com.satyam.api_test.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
