package eventsourcing;

public class EventHandler {
	
	Repository r = new Repository();
	public void addEvent(String userId, CreateUserEvent cue)
	{
		r.setUserData(userId, cue);
		
	}
	
	public void updateEvent(String userId, UpdateUserEvent uue)
	{
		r.setUserData(userId, uue);
	}


}
