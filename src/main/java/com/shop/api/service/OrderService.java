package com.shop.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.api.model.Order;
import com.shop.api.repository.OrderRepository;

@Service
public class OrderService {
	@Autowired
	private OrderRepository orderRepository;

   	
	public Order saveOrder(Order order) {		
		return orderRepository.save(order);
	}

}
