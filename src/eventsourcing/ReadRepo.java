package eventsourcing;

import java.util.HashMap;
import java.util.Map;

public class ReadRepo {
	
	static Map<String, UserData> userSet = new HashMap();

	public static void setUserData(String userId, UserData userData)
	{
		userSet.put(userId, userData);
	}
	
	public static Map<String, UserData> getUsers()
	{
		return userSet;
	}
}
