package com.geekster.ecommerce.service;

import com.geekster.ecommerce.model.Product;
import com.geekster.ecommerce.repository.IProductRepo;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    IProductRepo iProductRepo;

    public void save(Product myProduct) {
        iProductRepo.save(myProduct);
    }

    public List<Product> findByProductCategory(String category) {

       return iProductRepo.findByProductCategory(category);
    }

    public void removeProductById(Integer productId) {

        //see if product id exits

        boolean isPresent = iProductRepo.existsById(productId);

        if (isPresent)
        {
            iProductRepo.deleteById(productId);
        }
        else
        {
            throw new EntityNotFoundException("Product Id does not exist for deletion");
        }

    }
}
