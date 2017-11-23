package com.nisum.lmf.demo.dto;

public class OrderDetailsDto {

	public static String FROMEMAILID="letmyfit@gmail.com";
	public static String PASSWORD="letmyfitteam";
	
	private int orderId;
	private String orderNumber;
	private String userId;
	private String fittings;
	private String productImage;
	private double price;
	private double additionalPrice;
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getFittings() {
		return fittings;
	}
	public void setFittings(String fittings) {
		this.fittings = fittings;
	}
	public String getProductImage() {
		return productImage;
	}
	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getAdditionalPrice() {
		return additionalPrice;
	}
	public void setAdditionalPrice(double additionalPrice) {
		this.additionalPrice = additionalPrice;
	}
	public String getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	
	
	
	
}
