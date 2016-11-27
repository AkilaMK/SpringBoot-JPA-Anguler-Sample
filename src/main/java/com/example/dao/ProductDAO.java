package com.example.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.model.Product;

public interface ProductDAO extends CrudRepository<Product, Long>{

	@Query("select p from Product p where p.productName like :name%")
	List<Product> searchProductIgnoreCase(@Param("name") String name);

}
