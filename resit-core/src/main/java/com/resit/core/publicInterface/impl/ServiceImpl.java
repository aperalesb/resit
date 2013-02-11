package com.resit.core.publicInterface.impl;

import com.resit.core.publicInterface.ServiceInterface;
import com.resit.core.publicInterface.beans.Product;
import com.resit.core.publicInterface.beans.Receipt;

public class ServiceImpl implements ServiceInterface {

	@Override
	public Receipt saveReceipt(String companyCode) {
		Receipt receipt = new Receipt(companyCode, "0000");
		
		return receipt;
	}
	
	@Override
	public Receipt getReceipt(String companyCode, String receiptCode) {
		Receipt receipt = new Receipt(companyCode, receiptCode);
		receipt.getDetail().add(new Product("0131", "Camisa", 21.75F, 1));
		receipt.getDetail().add(new Product("0222", "Pantalón", 31.50F, 1));
		receipt.getDetail().add(new Product("0134", "Zapatos", 69.31F, 1));
		
		return receipt;
	}

}
