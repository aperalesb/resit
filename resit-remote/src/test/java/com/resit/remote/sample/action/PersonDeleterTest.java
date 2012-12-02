package com.resit.remote.sample.action;

import org.apache.struts2.StrutsSpringTestCase;

import com.opensymphony.xwork2.ActionProxy;
import com.resit.remote.sample.action.PersonDeleter;

public class PersonDeleterTest extends StrutsSpringTestCase {
	@Override
	public String getContextLocations() {
		return "applicationContextTest.xml";
	}
	
	public void testExecute() throws Exception {
		request.setParameter("emplid", "3");
		ActionProxy proxy = getActionProxy("personDelete");
		PersonDeleter action = (PersonDeleter) proxy.getAction();
		assertNotNull(action);
		String result = proxy.execute() ;
		assertEquals("El resultado de ejecutar el método no es success.", "success", result);
	}
}