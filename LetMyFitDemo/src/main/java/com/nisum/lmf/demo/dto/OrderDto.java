package com.nisum.lmf.demo.dto;

import java.sql.Timestamp;

public class OrderDto {
	
	private String userId;
	private Integer productId;

	
	private String measurements;
	private Double price;
	private boolean addFittings;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getMeasurements() {
		return measurements;
	}
	public void setMeasurements(String measurements) {
		this.measurements = measurements;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public boolean isAddFittings() {
		return addFittings;
	}
	public void setAddFittings(boolean addFittings) {
		this.addFittings = addFittings;
	}
	
	
	
	
	

}
