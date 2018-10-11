package com.capgemini.website.entity;

public class LineItem {
	int lineItemId;
	Product product;
	int quantity;

	
	public LineItem(int lineItemId, Product product, int quantity) {
		super();
		this.lineItemId = lineItemId;
		this.product = product;
		this.quantity = quantity;
	}
	public LineItem() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getLineItemId() {
		return lineItemId;
	}
	public void setLineItemId(int lineItemId) {
		this.lineItemId = lineItemId;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	
	
}


