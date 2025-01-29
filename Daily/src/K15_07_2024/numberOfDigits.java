//Write a java program to count the number of digits in a given number

package K15_07_2024;

import java.util.Scanner;

public class numberOfDigits {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num=scan.nextInt();
		int count=0;
		while(num!=0)
		{
			num = num/10;
			count++;
		}
		System.out.println(count);
	}

}
