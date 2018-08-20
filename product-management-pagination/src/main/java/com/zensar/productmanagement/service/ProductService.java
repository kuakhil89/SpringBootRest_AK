package com.zensar.productmanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.zensar.productmanagement.entities.Product;
import com.zensar.productmanagement.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;

	public List<Product> findByProductName(String productName, PageRequest pageRequest) {
		return productRepository.findByProductName( productName,  pageRequest);
	
	}

	
}
