package EpsonCalculator;

public class LaunchCalculator {
	public static void main(String[] args) {
		EpsonCalculator c = new EpsonCalculator();
		c.add();
		c.sub();
		c.mul();
		c.div();
		c.mod();
		boolean res = (c.isprime(21));
		if(res==true) {
			System.out.println("Entered number is prime");
		}
		else {
			System.out.println("Enter number is not prime");
		}
	}
}
