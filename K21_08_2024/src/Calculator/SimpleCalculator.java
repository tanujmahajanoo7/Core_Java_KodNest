package Calculator;

public class SimpleCalculator implements Calculator {

	@Override
	public void add() {
		System.out.println("Simple Calculator");
		System.out.println(10+10);
	}

	@Override
	public void sub() {
		System.out.println("Simple Calculator");
		System.out.println(10-10);
	}

	@Override
	public void mul() {
		System.out.println("Simple Calculator");		
		System.out.println(10*10);
	}

	@Override
	public void div() {
		System.out.println("Simple Calculator");		
		System.out.println(10/5);
	}

	@Override
	public void mod() {
		System.out.println("Simple Calculator");
		System.out.println(10%2);
	}

}
