package com.shop.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shop.api.model.Order;
public interface OrderRepository extends JpaRepository<Order, Long>{

}
