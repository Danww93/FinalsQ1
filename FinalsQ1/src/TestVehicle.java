import java.util.UUID;


public class TestVehicle 
{
	public static void main (String[]args)
	{
		UUID uu;
		Person p = new Person();
		Truck t = new Truck();
		Car c = new Car();
		MotorCycle m = new MotorCycle();
		
		//person a
		p.setFirstName("a");
		p.setLastName(null);
		p.setPersonID();
		
		//car for person a
		c.setName("Ford Mustang");
		c.setColor("White");
		c.setWeight(1500);
		c.setNumberOfDoors(4);
		c.transferOwnership(p);
		
		//truck for person a
		t.setName("Ford F-150");
		t.setColor("Black");
		t.setWeight(2500);
		t.setNumberOfAxels(2);
		t.transferOwnership(p);
		
		//person b
		p.setFirstName("b");
		p.setLastName(null);
		p.setPersonID();
		
		//From a to b
		t.transferOwnership(p);
		
		//Motorcycle
		m.setName("Hayabusa");
		m.setColor("Dark Grey");
		m.setWeight(500);
		m.sethasSideCar(false);
		
		
		
		
		
		
	}
	
	
	
	
	

}
