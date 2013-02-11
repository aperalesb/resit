package com.resit.core.publicInterface.beans;

import java.util.ArrayList;
import java.util.List;

public class Receipt {
	private String retailerId;
	private String receiptCode;
	private List<Product> detail;
	
	public Receipt(String retailerId, String receiptCode) {
		super();
		this.retailerId = retailerId;
		this.receiptCode = receiptCode;
	}

	public String getReceiptCode() {
		return receiptCode;
	}

	public void setReceiptCode(String receiptCode) {
		this.receiptCode = receiptCode;
	}

	public List<Product> getDetail() {
		if (detail == null){
			detail = new ArrayList<Product>();
		}
		return detail;
	}

	public void setRetailerId(String retailerId) {
		this.retailerId = retailerId;
	}

	public String getRetailerId() {
		return retailerId;
	}
	
}
