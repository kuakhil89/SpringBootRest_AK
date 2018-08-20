package com.zensar.productmanagement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;

import com.zensar.productmanagement.entities.Product;
import com.zensar.productmanagement.service.ProductService;

@SpringBootApplication
public class ProductManagementApplication implements CommandLineRunner {
	@Autowired
	private ProductService productService;
	
	public static void main(String[] args) {
		
		SpringApplication.run(ProductManagementApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		
		//List<Product> products=productService.findByProductName("Laptop",new PageRequest(0,4,Direction.ASC,"productPrice"));
		
		//products.forEach(System.out::println);

		
	}

}
