package com.keerthanaa.customer_orders.repository;

import com.keerthanaa.customer_orders.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author keerthanaa Y
 */
public interface OrderRepository extends JpaRepository<Order, Long> {
}
