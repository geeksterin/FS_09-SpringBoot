package com.geekster.ecommerce.repository;

import com.geekster.ecommerce.model.Address;
import com.geekster.ecommerce.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOrderRepo extends JpaRepository<Order,Long> {


    Order findByOrderId(Long orderId);
}
