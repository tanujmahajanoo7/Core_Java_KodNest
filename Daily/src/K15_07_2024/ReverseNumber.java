//Write a java program to reverse a given number 123->321

package K15_07_2024;

import java.util.Scanner;

public class ReverseNumber {

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
		
		System.out.println(ans);
		
		
	}

}
