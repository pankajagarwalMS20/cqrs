package eventsourcing;
public class UserData {
	
	@Override
	public int hashCode() {
		final int id = 31;
		int result = 1;
		result = id * result + ((userId == null) ? 0 : userId.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserData other = (UserData) obj;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		return true;
	}

	private String firstName;
	private String lastName;
	private String userId;
	private String contact;
	private Address address;
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
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

	public void setLastName(String a_lastName)
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
