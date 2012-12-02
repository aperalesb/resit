package com.resit.remote.sample.action;

import org.apache.struts2.StrutsSpringTestCase;
import org.junit.Test;
import com.opensymphony.xwork2.ActionProxy;
import com.resit.remote.sample.action.AllPersonsFinder;

public class AllPersonsFinderTest extends StrutsSpringTestCase {
	@Override
	public String getContextLocations() {
		return "applicationContextTest.xml";
	}

	@Test
	public void testExecute() throws Exception {
		ActionProxy proxy = getActionProxy("allPersonsFinder");
		AllPersonsFinder action = (AllPersonsFinder) proxy.getAction() ;
		assertNotNull(action);
		String result = proxy.execute() ;
		assertEquals("El resultado de ejecutar el método no es success.", "success", result);
	}
}