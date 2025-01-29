package PractiseProblems;

class Vehicle
{
	String make;
	String model;
	int year;
	
	final void displayInfo()
	{
		System.out.println(make+model+year);
	}
}

class car extends Vehicle
{
	int fuel;
	void displayInfo()
	{
		System.out.println(fuel);
	}
}
public class InheritanceAndFinal {
	public static void main(String[] args)
	{
		
	}
}
