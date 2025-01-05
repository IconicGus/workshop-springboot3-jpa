package com.iconicgus.springboot.repositories;

import com.iconicgus.springboot.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
