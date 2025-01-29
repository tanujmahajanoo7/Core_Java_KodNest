package HasARelationship;

public class Mobile {
	String brand="Apple";
	String color="blue";
	
	OS os = new OS();
	
//	Charger c;
	
	void port(Charger c)
	{
		System.out.println(c.color + " " + c.brand + " " + c.output);
		c.passElectricity();
	}
}
