package K11_07_2024;
import java.util.Scanner;
public class positivenegativezero {
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		
		int n=scan.nextInt();
		
		if(n>0)
			System.out.println("Number is positive");
		else if(n<0)
			System.out.println("Number is negative");
		else if(n==0)
			System.out.println("Number is zero");
		else
			System.out.println("Enter correct number");
	}
}
