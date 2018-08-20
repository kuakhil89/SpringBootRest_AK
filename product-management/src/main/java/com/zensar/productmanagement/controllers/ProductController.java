package com.zensar.productmanagement.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
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
	
	@PostMapping("/products")
	public Product insertProduct(@RequestBody Product product) {
		return productService.insertProduct(product);
		
	}
	@GetMapping("/products")
	public Iterable<Product> getALlProducts()
	{
		return productService.getALlProducts();
	}
	@PutMapping("/products")
	public Product updateProduct(@RequestBody Product product)
	{
		return productService.updateProduct(product);
	}
	
	@DeleteMapping("products/{id}")
	public void deleteProduct(@PathVariable int id)
	{
		 productService.deletProduct(id);;
		
	}
	@GetMapping("/products/{id}")
	public Optional<Product> getParticularProduct(@PathVariable int id)
	{
		return productService.getParticularProduct(id);
	}
	
	@GetMapping("/product/{productName}")
	public List<Product> findbyProductName(@PathVariable String productName)
	{
		return productService.findbyProductName(productName);
	}
	@GetMapping("/product/{productName}/{price}")
	public List<Product> searchByNameAndPrice(@PathVariable String productName,@PathVariable int  price)
	{
		return productService.searchByNameAndPrice(productName,price);
	}
}
