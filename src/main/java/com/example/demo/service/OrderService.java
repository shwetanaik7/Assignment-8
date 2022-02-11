package com.example.demo.service;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.OrderModel;
import com.example.demo.repository.OrderRepository;

@Service
public class OrderService {
	@Autowired
	OrderRepository orderRepository;

	public void saveOrder(@Valid OrderModel order) {
		orderRepository.save(order);
	}

	public Iterable<OrderModel> getOrder() {
		return orderRepository.findAll();
	}

}
