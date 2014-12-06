
public class Truck extends Vehicle implements IntOfVehicle
{
	private int NumberOfAxels;

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
	
	public void setNumberOfAxels(int NumberOfAxels) 
	{
		this.NumberOfAxels = NumberOfAxels;
		
	}

	

	

}
