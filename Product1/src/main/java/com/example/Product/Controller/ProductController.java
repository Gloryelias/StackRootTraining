package com.example.Product.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.Product.Doamin.Product;

import com.example.Product.Service.ProductService;

@RestController
@RequestMapping("/p")
public class ProductController {
	@Autowired
	ProductService ps;
	
	@GetMapping("/product/{id}") 
	public Product getCustomer(@PathVariable int id) {
		Product c= ps.findCustomerById(id);	
		return c;
	}
	
	@PostMapping("/product")
	public Product createUser(@RequestBody Product c) {
		
		ps.addUser(c);
				
		return c;

	}
	
	@GetMapping("/products") 
	public List<Product> getAllUsers() {
	List<Product> users= ps.getAllCustomer();
		return users;		
	}
}
