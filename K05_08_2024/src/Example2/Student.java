package Example2;

public class Student {
	int id = 100;
	String name = "Tanuj";
	String gender = "Male";
	void eat()
	{
		System.out.println("Student is eating");
	}
	void sleep()
	{
		System.out.println("Student is sleeping");
	}
	void study()
	{
		System.out.println("Student is studying");
	}
	
	Heart heart = new Heart();	// Composite Object
	Brain brain = new Brain();	// Composite Object
	
	void sbook(Book b)	// Aggregate Object
	{
		System.out.println(b.title + " " + b.author + " " + b.price);
		b.userRead();
		System.out.println("*************************************");
	}
	void scar(Car c)	// Aggregate Object
	{
		System.out.println(c.brand + " " + c.color + " " + c.cost);
		c.userdrive();
		System.out.println("*************************************");
	}
	
}
