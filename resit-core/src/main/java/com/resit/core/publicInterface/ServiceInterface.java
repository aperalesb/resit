package com.resit.core.publicInterface;

import com.resit.core.publicInterface.beans.Receipt;

public interface ServiceInterface {
	
	Receipt saveReceipt(String companyCode);

	Receipt getReceipt(String companyCode, String receiptCode);

}
