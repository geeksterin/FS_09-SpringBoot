package com.geekster.ecommerce.service;


import com.geekster.ecommerce.model.Address;
import com.geekster.ecommerce.model.Order;
import com.geekster.ecommerce.model.Product;
import com.geekster.ecommerce.model.User;
import com.geekster.ecommerce.repository.IAddressRepo;
import com.geekster.ecommerce.repository.IOrderRepo;
import com.geekster.ecommerce.repository.IProductRepo;
import com.geekster.ecommerce.repository.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    IOrderRepo iOrderRepo;
    @Autowired
    IAddressRepo iAddressRepo;
    @Autowired
    IProductRepo iProductRepo;
    @Autowired
    IUserRepo iUserRepo;


    public void createOrder(Order myOrder) {

        Integer addressID = myOrder.getOrderAddress().getAddressId();
        Address myAddress  = iAddressRepo.findByAddressId(addressID);

        Integer productId = myOrder.getOrderProduct().getProductId();
        Product myProduct = iProductRepo.findByProductId(productId);


        Long userId = myOrder.getOrderUser().getUserId();
        User myUser = iUserRepo.findByUserId(userId);

        if(myAddress !=null && myProduct!= null && myUser != null) {
            myOrder.setOrderAddress(myAddress);
            myOrder.setOrderProduct(myProduct);
            myOrder.setOrderUser(myUser);


            iOrderRepo.save(myOrder);
        }
        else
        {
            throw new IllegalStateException("Id's sent for  creating order are not valid");
        }


    }

    public Order fetchOrder(Long orderId) {

        return iOrderRepo.findByOrderId(orderId);
    }
}
