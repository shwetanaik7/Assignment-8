package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.OrderModel;

public interface OrderRepository extends CrudRepository<OrderModel, Integer> {

}
