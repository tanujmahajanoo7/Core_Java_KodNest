package IncreamentDecrementP;
import java.util.Scanner;

public class IDApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		scan.close();
		
		IncrementDecrement i = new IncrementDecrement();
		i.id(num);

	}

}
