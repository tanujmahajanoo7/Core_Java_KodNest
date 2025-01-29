package Handling;

public class Eagle extends Bird {
	void fly() {
		System.out.println("Eagle Bird is flying");
	}
	
//	@Override
//	void eat() throws SQLException {
//		System.out.println("Eagle Bird is eating");		
//	}
	
	@Override
	void sleep() throws ArithmeticException {
		System.out.println("Eagle Bird is sleeping");
	}
	
	@Override
	void foodHabit() throws ArithmeticException {
		System.out.println("Eagle bird is carnivorous");
	}

}
