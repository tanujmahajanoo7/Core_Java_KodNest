package K11_07_2024;
import java.util.Scanner;
public class monthNumber {
	public static void main(String []args)
	{
		Scanner scan = new Scanner(System.in);
		int n;
		System.out.print("Enter the month number between 1 to 12 : ");
		n=scan.nextInt();
		
		if(n==12||n==1||n==2)
			System.out.println("Season : Winter");
		else if(n==3 || n==4 || n==5)
			System.out.println("Season : Spring");
		else if(n==6 || n==7 || n==8)
			System.out.println("Season : Summer");
		else if(n==9 || n==10 || n==11)
			System.out.println("Season : Rainy");
		else
			System.out.println("Enter correct number");
	}
}
