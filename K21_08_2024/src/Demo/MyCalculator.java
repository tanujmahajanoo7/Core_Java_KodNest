package Demo;

public class MyCalculator extends Demo implements AbstractCalculator{
	
	void greet2() {
		System.out.println("Hello Hey");
	}
	
	@Override
	public void addition() {
		System.out.println("addition");
	}

	@Override
	public void subtraction() {
		System.out.println("subtraction");
		
	}

	@Override
	public void multiplication() {		
		System.out.println("multiplication");
	}

	@Override
	public void division() {		
		System.out.println("division");
	}
	
}
