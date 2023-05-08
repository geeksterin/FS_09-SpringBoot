package com.geekster.ecommerce.controller;


import com.geekster.ecommerce.model.Order;
import com.geekster.ecommerce.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @PostMapping()
    void placeOrder(@RequestBody Order myOrder)
    {
        orderService.createOrder(myOrder);
    }



}
