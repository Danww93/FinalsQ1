import java.util.UUID;


public class Person 
{
	private String FirstName;
	private String LastName;
	private UUID PersonID;
	
	public void setFirstName(String FirstName)
	{
		this.FirstName = FirstName;
	}
	
	public void setLastName(String LastName)
	{
		this.LastName = LastName;
	}
	
	public void setPersonID()
	{
		this.PersonID = UUID.randomUUID();
	}
	
	public String getFirstName()
	{
		return FirstName;
	}
	
	public String getLastName()
	{
		return LastName;
	}
	
	public UUID getPersonID()
	{
		return PersonID;
	}

}
