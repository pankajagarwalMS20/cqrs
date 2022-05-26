package eventsourcing;

import java.util.Set;
import java.util.stream.Stream;

public class QueryModel {
	
	public static Stream<UserData> getUserStartingWith(String charToSearch)
	{
		return ReadRepo.getUsers().values().stream().filter(item -> item.getLastName().startsWith(charToSearch));
	}

	public static Stream<UserData> getUsersWithPinCode(String pinCode)
	{
		return ReadRepo.getUsers().values().stream().filter(item -> !item.getAddress().getPincode().equals(pinCode));
	}
}
