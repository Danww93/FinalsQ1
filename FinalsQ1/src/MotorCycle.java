
public class MotorCycle extends Vehicle implements IntOfVehicle
{
	private Boolean hasSideCar;

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
	
	public void sethasSideCar(Boolean hasSideCar) 
	{
		this.hasSideCar = hasSideCar;
		
	}

	

	
	
	

}
