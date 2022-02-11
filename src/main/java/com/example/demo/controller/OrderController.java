package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.OrderModel;
import com.example.demo.service.OrderService;

@RestController
public class OrderController {
	@Autowired
	OrderService orderService;
	
	@PostMapping("/order")
	@ResponseStatus(code = HttpStatus.CREATED)
	public void saveOrder(@RequestBody @Valid OrderModel order) {
		orderService.saveOrder(order);
	}
	
	@GetMapping("/order")
	Iterable<OrderModel> getOrder() {
		return orderService.getOrder();
	}
}
