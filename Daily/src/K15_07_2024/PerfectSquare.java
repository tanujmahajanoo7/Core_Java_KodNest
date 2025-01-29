//Write a java program to check whether a given number is perfect square or not

package K15_07_2024;

import java.util.Scanner;

public class PerfectSquare {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		boolean flag = false;
		for(int i=0;i<=num/2;i++)
		{
			if(i*i==num)
			{
				System.out.println(num + " is perfect square");
				flag = true;
				break;
			}
		}
		if (flag==false)
			System.out.println(num +" is not a perfect square");
	}
}
