package com.cg.go.pojo;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class Cart {
	
	@NotEmpty(message="Please enter Product Id")
	private String productId;
	@NotNull(message="Please enter Quantity you want to add")
	@Min(value=1, message="Add quantity greater than 0")
	private Integer productQuantity;
	@NotNull(message="Please enter User Id")
	private int cutomerId;
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public Integer getProductQuantity() {
		return productQuantity;
	}
	public void setProductQuantity(Integer productQuantity) {
		this.productQuantity = productQuantity;
	}
	public int getCutomerId() {
		return cutomerId;
	}
	public void setCutomerId(int cutomerId) {
		this.cutomerId = cutomerId;
	}	
	
}
	