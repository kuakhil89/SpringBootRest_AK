package com.zensar.productmanagement.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.productmanagement.entities.Product;
import com.zensar.productmanagement.service.ProductService;

@RestController
public class ProductController {
	@Autowired
	private ProductService productService;
	
	@GetMapping("/products/{productname}")
	public List<Product> getProductByPagination(@PathVariable String productName) {
		PageRequest pageRequest1=new PageRequest(0,4,Direction.ASC,"productPrice");
		List<Product> products= productService.findByProductName( productName,  pageRequest1);
		products.forEach(System.out::println);
		return products;
		
	}
}
