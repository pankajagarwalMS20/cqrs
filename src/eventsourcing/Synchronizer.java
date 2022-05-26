package eventsourcing;

public class Synchronizer {
	
	public void hanldeUserData(CreateUserEvent cue)
	{
		UserData u1 = new UserData();
		u1.setFirstName(cue.getFirstName());
		u1.setLastName(cue.getLastName());
		u1.setAddress(cue.getAddress());
		u1.setUserId(cue.getUserId());
		ReadRepo.setUserData(u1.getUserId(), u1);
	}
	
	public void hanldeUserData(UpdateUserEvent cue)
	{
		UserData u1 = new UserData();
		u1.setFirstName(cue.getFirstName());
		u1.setLastName(cue.getLastName());
		u1.setAddress(cue.getAddress());
		u1.setUserId(cue.getUserId());
		ReadRepo.setUserData(u1.getUserId(), u1);
	}

}
