package com.geekster.ecommerce.repository;

import com.geekster.ecommerce.model.Order;
import com.geekster.ecommerce.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IProductRepo extends JpaRepository<Product, Integer> {


    Product findByProductId(Integer productId);

    List<Product> findByProductCategory(String category);
}
