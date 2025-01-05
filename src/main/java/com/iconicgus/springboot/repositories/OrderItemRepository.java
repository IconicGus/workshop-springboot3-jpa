package com.iconicgus.springboot.repositories;

import com.iconicgus.springboot.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
