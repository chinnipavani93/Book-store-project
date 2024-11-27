package com.example.practice.ProductRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.practice.models.Product;

@Repository
public interface ProductRepository extends  JpaRepository<Product,Long>{

}
