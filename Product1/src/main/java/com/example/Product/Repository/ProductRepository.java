package com.example.Product.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Product.Doamin.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {

}
