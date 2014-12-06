
public abstract class Vehicle implements IntOfVehicle
{ 
	public String Name;
	public String Color;
	public int Weight;
	public Person newOwner;
	
	public void transferOwnership(Person newOwner)
	{
		this.newOwner = newOwner;
	}
	

}
