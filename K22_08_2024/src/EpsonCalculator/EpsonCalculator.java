package EpsonCalculator;

import java.util.Scanner;

public class EpsonCalculator extends ScientificCalculator {

	@Override
	public void div() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println("Division of " + a + " & " + b + " is " +(a/b));	
	}
	
	boolean isprime (int num) {
		if(num<=1) {
			return false;
		}
		else if(num==2) {
			return true;
		}
		else {
			for(int i=2;i<num/2;i++) {
				if(num%i==0) {
					return false;
				}
			}
			return true;
		}
	}
}
