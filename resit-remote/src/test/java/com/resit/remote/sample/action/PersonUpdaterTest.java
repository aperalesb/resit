package com.resit.remote.sample.action;

import org.apache.struts2.StrutsSpringTestCase;

import com.opensymphony.xwork2.ActionProxy;
import com.resit.remote.jpa.model.Person;
import com.resit.remote.sample.action.PersonUpdater;

public class PersonUpdaterTest extends StrutsSpringTestCase {
	@Override
	public String getContextLocations() {
		return "applicationContextTest.xml";
	}

	public void testInput() throws Exception {
		request.setParameter("emplid", "1");
		ActionProxy proxy = getActionProxy("inputPersonUpdate");
		PersonUpdater action = (PersonUpdater) proxy.getAction();
		assertNotNull(action);
		String result = proxy.execute() ;
		assertEquals("El resultado de ejecutar el método no es success.", "input", result);
		Person person = action.getPerson() ;
		assertEquals("El apellido de la persona con emplid=1 tiene que ser Perales", "Perales", person.getLast_name() );
	}
	
	public void testExecute() throws Exception {
		request.setParameter("person.emplid", "2");
		request.setParameter("person.first_name", "Resit");
		request.setParameter("person.last_name", "Testing");
		
		ActionProxy proxy = getActionProxy("executePersonUpdate");
		PersonUpdater action = (PersonUpdater) proxy.getAction();
		assertNotNull(action);
		String result = proxy.execute() ;
		assertEquals("El resultado de ejecutar el método no es success.", "success", result);
		Person person = action.getPerson() ;
		assertEquals("El nombre de la persona tiene que ser Resit.", "Resit", person.getFirst_name() );
		assertEquals("El nombre de la persona tiene que ser Testing.", "Testing", person.getLast_name() );
	}
}