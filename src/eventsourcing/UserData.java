package eventsourcing;
public class UserData {
	
	private String firstName;
	private String lastName;
	private String userId;
	private String contact;
	
	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName(String a_firstName)
	{
		if (a_firstName != null)
		{
			firstName = a_firstName;
		}
	}
	
	public String getLastName()
	{
		return lastName;
	}

	public void getLastName(String a_lastName)
	{
		if (a_lastName != null)
		{
			lastName = a_lastName;
		}
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}
}
