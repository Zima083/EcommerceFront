package com.ecom.productcatalog.repository;

import com.ecom.productcatalog.model.product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<product,Long> {
List<product> findByCategoryId(Long categoryId);
}
