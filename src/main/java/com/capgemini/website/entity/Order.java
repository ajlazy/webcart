package com.capgemini.website.entity;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="websiteOrders")
public class Order {
	@Id
	int orderId;
	List<LineItem> lineItems;
	int orderAmount;
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public List<LineItem> getLineItems() {
		return lineItems;
	}
	public void setLineItems(List<LineItem> lineItems) {
		this.lineItems = lineItems;
	}
	public int getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(int orderAmount) {
		this.orderAmount = orderAmount;
	}
	public Order(int orderId, List<LineItem> lineItems, int orderAmount) {
		super();
		this.orderId = orderId;
		this.lineItems = lineItems;
		this.orderAmount = orderAmount;
	}
	

}


