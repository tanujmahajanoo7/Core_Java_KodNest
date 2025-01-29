package K08_07_2024;

import java.util.Scanner;

public class Pattern {

	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("--------------------1--------------------");
		for(int i=0;i<5;i++)
		{
			System.out.print("*");
		}
		System.out.println();
		
		System.out.println("--------------------2--------------------");

		for(int i=0;i<5;i++)
		{
			System.out.println("*");
		}
		
		System.out.println("--------------------3--------------------");	

//		int n = scan.nextInt();
//		char c = scan.next().charAt(0);
		int n=5;
		char c = '@';
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(c);
			}
			System.out.println("");
		}

		System.out.println("--------------------4--------------------");
				
//		int n = scan.nextInt();
//		char c = scan.next().charAt(0);
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		
		System.out.println("--------------------5--------------------");
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print(i);
			}
			System.out.println("");
		}

		System.out.println("--------------------6--------------------");
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print(j);
			}
			System.out.println("");
		}
		
		System.out.println("--------------------7--------------------");
		
		for(int i=5;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println("");
		}
		
		System.out.println("--------------------8--------------------");
		
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(j);
			}
			System.out.println("");
		}
		
		System.out.println("--------------------9--------------------");
		
		for(int line=1;line<=5;line++)
		{
			for(int column=1;column<=line;column++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		
		System.out.println("--------------------10--------------------");

		System.out.println("--------------------H.W.--------------------");

		for(int line=5;line>=1;line--)
		{
			for(int column=line;column>=1;column--)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		
		System.out.println("--------------------11--------------------");
		
		for(int i=3;i>=1;i--)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print("*");
				System.out.print("#");
			}
			System.out.println("");
		}
		
		System.out.println("--------------------12--------------------");
		
		for(int i=5;i>=1;i--)
		{
			if(i%2==0)
			{
				continue;
			}
			for(int j=i;j>=1;j--)
			{
				System.out.print("*");
			}
			System.out.println("");
		}

		System.out.println("--------------------13--------------------");
		
		for(int i=1;i<=5;i++)
		{
			if(i%2==0)
			{
				continue;
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		
		System.out.println("--------------------14--------------------");
		
		int res=0;
		for(int i=1;i<=4;i++)
		{
			res+=2;
			for(int j=1;j<=res;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		
		System.out.println("--------------------15--------------------");
		
		for(int i=1;i<=4;i++)
		{
			
			for(int j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}	
		
	}
}
