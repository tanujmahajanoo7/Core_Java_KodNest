package K03_07_2024;

import java.util.Scanner;

public class UserMarks {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter 200 for male and 300 for female");
		
		int gender = scan.nextInt();
		
		
		System.out.println("Enter Marks");
		double marks=scan.nextInt();
		int index = (int) (marks/10);
		
		if(gender==200)
		{
			switch(index)
			{
			case 10:
			case 9:
			case 8:
				System.out.print("Very Good");
				break;
			case 7:
				System.out.print("Good");
				break;
			case 6:
				System.out.print("Can do good");
				break;
			case 5:
				System.out.print("Bad");
				break;
			default:
				System.out.print("Very Bad");
				break;
			}
		}
		else if(gender==300)
		{
			switch(index)
			{
			case 10:
			case 9:
			case 8:
				System.out.print("Very very Good");
				break;
			case 7:
			case 6:
				System.out.print("Very good");
				break;
			case 5:
			case 4:
			case 3:
				System.out.print("Good");
				break;
			case 2:
			case 1:
			case 0:
				System.out.println("ok");
				break;
			}
		}
		else
		{
			System.out.println("Neither 200 nor 300");
		}
	}

}
