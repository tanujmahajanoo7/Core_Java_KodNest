package InheritanceFinal;

public class Bird {
	
	void fly() {
		System.out.println("The bird is flying");
	}
	
	void eat() {
		System.out.println("The bird is eating");		
	}

}


final class Eagle extends Bird {
	public void fly() {
		System.out.println("The Eagle is flying");
	}
}

final class Sparrow extends Bird { 
	public void fly() {
		System.out.println("The Sparrow is flying");		
	}
}

//class Tiger extends Sparrow {
//	public void fly() {
//		System.out.println("The Tiger is flying");		
//	}
//	
//}