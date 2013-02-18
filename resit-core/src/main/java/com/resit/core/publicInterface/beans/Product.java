package com.resit.core.publicInterface.beans;

public class Product {
	private String code;
	private String detail;
	private Float price;
	private Integer units;
	
	public Product(String code, String detail, Float price, Integer units) {
		super();
		this.code = code;
		this.detail = detail;
		this.price = price;
		this.units = units;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Integer getUnits() {
		return units;
	}

	public void setUnits(Integer units) {
		this.units = units;
	}
	
	
}
