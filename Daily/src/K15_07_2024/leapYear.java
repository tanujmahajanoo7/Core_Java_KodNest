//Write a java program to take year as input and check whether the given year is leap year or not

package K15_07_2024;

import java.util.Scanner;

public class leapYear {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int year = scan.nextInt();
		
		if (year % 400 == 0) 
		{
			System.out.println("leap year");
		}    
		else if (year % 100 == 0) 
		{
			System.out.println("Year is not leap year");
		}    
		else if (year % 4 == 0) 
		{
			System.out.println("Leap year");
		} 
		else 
		{
			System.out.println("Year is not leap year");
		}

	}

}
