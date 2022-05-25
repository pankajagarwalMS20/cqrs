package eventsourcing;

public class EventHandler {
	
	public void addEvent(String a_userId, CreateUserEvent userEvent)
	{
		Repository r = new Repository();
		r.getMap().put(a_userId, userEvent);
	}


}
