package com.resit.remote.sample.action;

import org.apache.struts2.StrutsSpringTestCase;

import com.opensymphony.xwork2.ActionProxy;
import com.resit.remote.jpa.model.Person;
import com.resit.remote.sample.action.PersonFinder;

public class PersonFinderTest extends StrutsSpringTestCase {
	@Override
	public String getContextLocations() {
		return "applicationContextTest.xml";
	}
	

	public void testExecute() throws Exception {
		request.setParameter("emplid", "1");
		ActionProxy proxy = getActionProxy("personFinder");
		PersonFinder action = (PersonFinder) proxy.getAction();
		assertNotNull(action);
		String result = proxy.execute() ;
		assertEquals("El resultado de ejecutar el método no es success.", "success", result);
		Person person = action.getPerson() ;
		assertEquals("El nombre de la persona con emplid=1 tiene que ser Alberto", "Alberto", person.getFirst_name() );
	}
}