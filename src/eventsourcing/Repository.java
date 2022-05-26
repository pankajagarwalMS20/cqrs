package eventsourcing;
import java.util.LinkedHashMap;

public class Repository {

	private LinkedHashMap<String, Object> map = new LinkedHashMap();
	Synchronizer sync = new Synchronizer();

	public void setUserData(String userId, CreateUserEvent userEvent)
	{
		map.put(userId, userEvent);
		sync.hanldeUserData(userEvent);
	}
	
	public void setUserData(String userId, UpdateUserEvent userEvent)
	{
		map.put(userId, userEvent);
		sync.hanldeUserData(userEvent);
	}
	
}
