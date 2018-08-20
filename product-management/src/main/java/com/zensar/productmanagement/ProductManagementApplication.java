package com.zensar.productmanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.zensar.productmanagement.entities.Product;
import com.zensar.productmanagement.service.ProductService;

@SpringBootApplication
public class ProductManagementApplication/* implements CommandLineRunner*/ {
	/*@Autowired
	private ProductService productService;*/
	public static void main(String[] args) {
		System.out.println("Ram");
		/*ConfigurableApplicationContext context =*/ SpringApplication.run(ProductManagementApplication.class, args);
		
		/*Product product=new Product();
		product.setProductId(1);
		product.setProductName("Pen");
		product.setProductPrice(100);
		
		ProductService productService=context.getBean("productService",ProductService.class);
		Product insertedProduct=productService.insertProduct(product);
		System.out.println(insertedProduct.toString());*/
	}

	/*@Override
	public void run(String... args) throws Exception {
		System.out.println("Seta");
		Product product=new Product();
		product.setProductId(1);
		product.setProductName("Pen");
		product.setProductPrice(100);
		productService.insertProduct(product);
	}*/
}
