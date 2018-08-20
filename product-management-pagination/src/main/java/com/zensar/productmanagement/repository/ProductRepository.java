package com.zensar.productmanagement.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.zensar.productmanagement.entities.Product;

@Repository
public interface ProductRepository extends PagingAndSortingRepository<Product, Integer> {

	List<Product> findByProductName(String productName, Pageable pageRequest);

}
