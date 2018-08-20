package com.zensar.productmanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.productmanagement.entities.Product;
import com.zensar.productmanagement.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;

	public Product insertProduct(Product product) {
		return productRepository.save(product);
		 
		
	}
	
	public Iterable<Product> getALlProducts()
	{
		return productRepository.findAll();
	}

	public Product updateProduct(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deletProduct(int id) {
		// TODO Auto-generated method stub
		 productRepository.deleteById(id);
	}

	public Optional<Product> getParticularProduct(int id) {
		
		return productRepository.findById(id);
		 
		  
		 
	}
	public List<Product> findbyProductName(String productName)
	{
		return productRepository.findByProductName(productName);
	}
	
	/*public List<Product> findbyProductName(String productName)
	{
		return productRepository.test(productName);
	}*/
	
	public List<Product> searchByNameAndPrice(String productName,int productPrice)
	{
		return productRepository.searchByNameAndPrice(productName,productPrice);
	}
}
