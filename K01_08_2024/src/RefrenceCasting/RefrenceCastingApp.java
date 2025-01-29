package RefrenceCasting;

public class RefrenceCastingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Child type refrence to child object
		Child child = new Child();
		child.eat();
		child.drink();
		
//		Parent type reference is refering to child object
//		Upcasting
		
//		Parent p = new Child();
		
		Parent p = child;
		p.eat();
//		p.drink() // Error because p is of type parent but drink is specific behaviour of child 
		
//		Downcasting to access specialized property 
		((Child) p).drink();
		
	}

}
