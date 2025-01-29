class Bird {
	String name;
	public void eat() {
		System.out.println("The bird is eating");
	}
	public void fly() {
		System.out.println("The bird will fly");
	}
}

class Eagle extends Bird {
	int age;
	public void fly() {
		System.out.println("The eagle will fly");
	}
	public void sleep() {
		System.out.println("The eagle is sleeping");
	}
}


class Sparrow extends Bird {
	int age;
	public void fly() {
		System.out.println("The sparrow will fly");
	}
	public void sleep() {
		System.out.println("The sparrow is sleeping");
	}	
}

public class Main {
	public static void main(String[] args)
	{
		Sparrow s = new Sparrow();
		s.eat();
		s.fly();
		s.sleep();
		System.out.println("----------------------------------");
		
		Eagle e = new Eagle();
		e.eat();
		e.fly();
		e.sleep();
		System.out.println("----------------------------------");
		
		//upcasting 
		//implicit typecasting 
		//parent refrence to child class object		
		Bird b1 = new Eagle();
//		(Sparrow)(b1) = new Sparrow();
		b1.eat();
		b1.fly();
//		b1.sleep();		// This will generate error
		((Eagle) b1).sleep();
//		b1.age=20;
		((Eagle)b1).age=20;
		System.out.println("----------------------------------");
		
		Bird b2 = new Sparrow();
		b2.eat();
		b2.fly();
//		b2.sleep();		// This will generate error
		((Sparrow)b2).sleep();
		
		
	}
}