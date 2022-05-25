package eventsourcing;

import org.junit.jupiter.api.Test;

public class EventHandlerTest {
	
	@Test
	public void addEventTest() 
	{
		UserData u1 = new UserData();
		u1.setFirstName("Test");
		u1.setContact("787");
		
		CreateUserEvent createEvent = new CreateUserEvent();
		createEvent.setFirstName(u1.getFirstName());

		EventHandler eh = new EventHandler();
		eh.addEvent("124", createEvent);
				
	} 

}
