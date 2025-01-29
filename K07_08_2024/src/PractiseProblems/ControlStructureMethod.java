package PractiseProblems;
import java.util.Scanner;



public class ControlStructureMethod {
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		
		if(isPrime(num))
		{
			System.out.println("Number is prime");
		}
		else
		{
			System.out.println("Number is not prime");
		}
	}
	
	public static boolean isPrime(int num) 
	{
        if (num <= 1) 
        {
            return false; 
        }
        for (int i = 2; i <= Math.sqrt(num); i++) 
        {
            if (num % i == 0) 
            {
                return false;
            }
        }
        return true;
	}
}


