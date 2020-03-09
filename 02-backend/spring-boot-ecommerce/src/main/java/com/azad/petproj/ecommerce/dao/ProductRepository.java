package com.azad.petproj.ecommerce.dao;

import com.azad.petproj.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
