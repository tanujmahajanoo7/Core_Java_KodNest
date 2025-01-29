package K15_07_2024;

import java.util.Scanner;

public class AmstrongNumber {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		int n;
		n=scan.nextInt();
		
		int digitCount = countNumberDigit(n);
		
		int copyNumber=n;
		
		int sum=0;
		
		while(copyNumber!=0)
		{
			int rem = copyNumber%10;
			
			int res= pow(rem,digitCount);
			
			sum = sum + res;
			
			copyNumber = copyNumber/10;			
		}
		
		if(n==sum)
		{
			System.out.println("Amstrong Number");
		}
		else
		{
			System.out.println("Not a Amstrong Number");
		}

	}
	
	public static int countNumberDigit(int temp)
	{
		int count=0;
		
		while(temp!=0)
		{
			temp/=10;
			count++;
		}
		return count;
	}
	
	public static int pow(int n,int digitCount)
	{
		int res=1;
		for(int i=0;i<digitCount;i++)
		{
			res=res*n;
		}
		return res;
	}

}




