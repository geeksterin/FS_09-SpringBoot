package com.geekster.ecommerce.controllers;

import com.geekster.ecommerce.models.Product;
import com.geekster.ecommerce.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/ProductManagement")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping(value = "/Products/All")
    List<Product> getAllProducts()
    {
        return productService.getAllProducts();
    }

    @PostMapping(value = "/Product")
    String addProduct(@RequestBody Product product)
    {
        return productService.addProduct(product);
    }


    //todo :make an api which filters by price
    //price as a paramater : return list of products
    //Get based api


}
