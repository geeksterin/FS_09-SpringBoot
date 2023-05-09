package com.geekster.ecommerce.controller;

import com.geekster.ecommerce.model.Product;
import com.geekster.ecommerce.model.User;
import com.geekster.ecommerce.repository.IProductRepo;
import com.geekster.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping()
    void addUser(@RequestBody Product myProduct)
    {
        productService.save(myProduct);
    }

    @GetMapping("/category/{category}")
    List<Product> getProductsByCategoryName(@PathVariable String category)
    {
        return productService.findByProductCategory(category);
    }

    @DeleteMapping("/{productId}")
    ResponseEntity<Void> removeProductById(@PathVariable int productId)
    {

        HttpStatus status;
        try {
            productService.removeProductById(productId);
            status = HttpStatus.OK;
        }
        catch(Exception e)
        {
            System.out.println(e);
            status = HttpStatus.NOT_ACCEPTABLE;
        }

        return new ResponseEntity<Void>(status);
    }
}
