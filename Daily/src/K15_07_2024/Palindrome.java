package K15_07_2024;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num=scan.nextInt();
		
		int copyNo=num;
		int ans=0;
		
		while(copyNo!=0)
		{
			int temp=copyNo%10;
			ans=(ans*10)+(temp);
			copyNo=copyNo/10;
		}
		
		if(ans==num)
		{
			System.out.println("Number is palindrome");
		}
		else
		{
			System.out.println("Number is not palindrome");
		}
	}
}
