
public class Car extends Vehicle implements IntOfVehicle
{
	private int NumberOfDoors;

	@Override
	public void setName(String Name) 
	{
		this.Name = Name;
		
	}

	@Override
	public void setColor(String Color) 
	{
		this.Color = Color;
		
	}

	@Override
	public void setWeight(int Weight) 
	{
		this.Weight = Weight;
		
	}
	
	public void setNumberOfDoors(int NumberOfDoors) 
	{
		this.NumberOfDoors = NumberOfDoors;
		
	}

	

}
