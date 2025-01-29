package SumOfDigit;

import java.util.Scanner;

public class SumOfDigitApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		SumOfDigit s = new SumOfDigit();
		int res = 0 ;
		while(num>=10)
		{
			res = s.sd(num);
			if(res>=10)
			{
				num=res;
			}
			else
			{
				num=res;
			}
		}
		
		System.out.println("Sum of Digit is till single digit " + res);
	}

}
