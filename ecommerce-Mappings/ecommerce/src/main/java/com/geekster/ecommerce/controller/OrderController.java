package com.geekster.ecommerce.controller;


import com.geekster.ecommerce.model.Order;
import com.geekster.ecommerce.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @PostMapping()
    ResponseEntity<String> placeOrder(@RequestBody Order myOrder)
    {

        String response;
        HttpStatus status;
        try {
            orderService.createOrder(myOrder);
            response = "Your order of " + myOrder.getProductCountNumber() + " was placed...successfully!!!";
            status = HttpStatus.CREATED;
        }
        catch(Exception e)
        {
            response = "Details passed with your Order are invalid!!!!...Please check and reOrder...";
            status = HttpStatus.BAD_REQUEST;
            System.out.println(e);
        }
        return new ResponseEntity<String>(response,status);


    }


    @GetMapping("/{orderId}")
    public Order getOrderById(@PathVariable Long orderId)
    {
        return orderService.fetchOrder(orderId);
    }



}
