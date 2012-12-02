package com.resit.remote.sample.action;

import org.apache.struts2.StrutsSpringTestCase;

import com.opensymphony.xwork2.ActionProxy;
import com.resit.remote.jpa.model.Person;
import com.resit.remote.sample.action.PersonSaver;

public class PersonSaverTest extends StrutsSpringTestCase {
	@Override
	public String getContextLocations() {
		return "applicationContextTest.xml";
	}

	public void testInput() throws Exception {
		ActionProxy proxy = getActionProxy("inputPersonSave");
		PersonSaver action = (PersonSaver) proxy.getAction();
		assertNotNull(action);
		String result = proxy.execute() ;
		assertEquals("El resultado de invocar el método input no es success.", "input", result);
	}
	
	public void testExecute() throws Exception {
		request.setParameter("person.first_name", "Eclipse");
		request.setParameter("person.last_name", "Indigo");
		ActionProxy proxy = getActionProxy("executePersonSave");
		PersonSaver action = (PersonSaver) proxy.getAction();
		assertNotNull(action);
		String result = proxy.execute() ;
		assertEquals("El resultado de invocar el método execute no es success.", "success", result);
		Person person = action.getPerson() ;
		assertEquals("El nombre de la primera Persona tiene que ser Eclipse", "Eclipse", person.getFirst_name() );
		assertEquals("El apellido de la primera Persona tiene que ser Indigo", "Indigo", person.getLast_name() );
	}
}