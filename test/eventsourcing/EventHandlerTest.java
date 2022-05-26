package eventsourcing;

import java.util.NoSuchElementException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EventHandlerTest {
	
	@Test
	public void addEventTest() 
	{
		UserData u1 = new UserData();
		u1.setFirstName("Ruchita");
		u1.setLastName("Karvir");
		u1.setContact("787");
		u1.setUserId("101");
		Address a1 = new Address();
		a1.setCity("Mumbai");
		a1.setPincode("400222");
		a1.setState("Maharashtra");
		u1.setAddress(a1);
		
		UserData u2 = new UserData();
		u2.setFirstName("Seema");
		u2.setLastName("Ubhare");
		u2.setContact("787");
		u2.setUserId("102");
		Address a2 = new Address();
		a2.setCity("Mumbai");
		a2.setPincode("400223");
		a2.setState("Maharashtra");
		u2.setAddress(a2);
		
		UserData u3 = new UserData();
		u3.setFirstName("Pankaj");
		u3.setLastName("Agarwal");
		u3.setContact("787");
		u3.setUserId("103");
		Address a3 = new Address();
		a3.setCity("Mumbai");
		a3.setPincode("400223");
		a3.setState("Maharashtra");
		u3.setAddress(a3);
		
		EventHandler eh = new EventHandler();
		
		CreateUserEvent createEvent = new CreateUserEvent();
		createEvent.setFirstName(u1.getFirstName());
		createEvent.setLastName(u1.getLastName());
		createEvent.setUserId(u1.getUserId());
		eh.addEvent("101", createEvent);
		
		createEvent = new CreateUserEvent();
		createEvent.setFirstName(u2.getFirstName());
		createEvent.setLastName(u2.getLastName());
		createEvent.setUserId(u2.getUserId());
		eh.addEvent("102", createEvent);
		
		createEvent = new CreateUserEvent();
		createEvent.setFirstName(u3.getFirstName());
		createEvent.setLastName(u3.getLastName());
		createEvent.setUserId(u3.getUserId());
		eh.addEvent("103", createEvent);
		
		UpdateUserEvent updateEvent = new UpdateUserEvent();
		u1.setLastName("Mestry");
		updateEvent.setFirstName(u1.getFirstName());
		updateEvent.setLastName(u1.getLastName());
		updateEvent.setUserId(u1.getUserId());
		eh.updateEvent("101", updateEvent);
		
		Assertions.assertEquals("Mestry", QueryModel.getUserStartingWith("M").findFirst().get().getLastName());
		
		Assertions.assertEquals("Agarwal", QueryModel.getUserStartingWith("A").findFirst().get().getLastName());
		
		Assertions.assertThrows(NoSuchElementException.class,  () -> QueryModel.getUserStartingWith("K").findFirst().get().getLastName());
		
	} 
	
	@Test
	public void testUsersPincode() 
	{
		UserData u1 = new UserData();
		u1.setFirstName("Ruchita");
		u1.setLastName("Karvir");
		u1.setContact("787");
		u1.setUserId("101");
		Address a1 = new Address();
		a1.setCity("Mumbai");
		a1.setPincode("401303");
		a1.setState("Maharashtra");
		u1.setAddress(a1);
		
		UserData u2 = new UserData();
		u2.setFirstName("Seema");
		u2.setLastName("Ubhare");
		u2.setContact("787");
		u2.setUserId("102");
		Address a2 = new Address();
		a2.setCity("Mumbai");
		a2.setPincode("400223");
		a2.setState("Maharashtra");
		u2.setAddress(a2);
		
		EventHandler eh = new EventHandler();
		
		CreateUserEvent createEvent = new CreateUserEvent();
		createEvent.setFirstName(u1.getFirstName());
		createEvent.setLastName(u1.getLastName());
		createEvent.setUserId(u1.getUserId());
		createEvent.setAddress(u1.getAddress());
		eh.addEvent("101", createEvent);
		
		createEvent = new CreateUserEvent();
		createEvent.setFirstName(u2.getFirstName());
		createEvent.setLastName(u2.getLastName());
		createEvent.setUserId(u2.getUserId());
		createEvent.setAddress(u2.getAddress());
		eh.addEvent("102", createEvent);
	
		
		Assertions.assertEquals("Seema", QueryModel.getUsersWithPinCode("401303").findFirst().get().getFirstName());
	} 
}
