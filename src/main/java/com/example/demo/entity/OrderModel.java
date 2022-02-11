package com.example.demo.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

@Entity
public class OrderModel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer orderId;
	
	@NotBlank
	@NotEmpty
	String name;

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
