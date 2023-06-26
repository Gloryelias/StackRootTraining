package com.example.Product.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.Product.Doamin.Product;
import com.example.Product.Repository.ProductRepository;
@Service
public class ProductService {
    @Autowired
    ProductRepository ps;
	public Product findCustomerById(int id) {
		Optional<Product> result = ps.findById(id);
		Product c=result.get();
		return c;
	}
	public void addUser(Product c) {
		 ps.save(c);
		
	}
	public List<Product> getAllCustomer() {
		return ps.findAll();
	}

}
