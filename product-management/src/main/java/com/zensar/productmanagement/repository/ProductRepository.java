package com.zensar.productmanagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.zensar.productmanagement.entities.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {
	@Query("SELECT p from Product p where p.productName=?1")
	
	List<Product> findByProductName(String productName);
	
	//List<Product> test(String productName);
	
	@Query("SELECT p from Product p where p.productName=?1 and p.productPrice=?2")
	List<Product> searchByNameAndPrice(String productName,int productPrice);

}
