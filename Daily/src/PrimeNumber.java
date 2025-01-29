import java.util.Scanner;

public class PrimeNumber {
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("uf... nuber to enter kr pehele");
		int n;
		n=scan.nextInt();
		
		if(n==1)
			System.out.println("Yr muze nahi pata 1 prime hai ki nahi google krlena");
		
		for(int i=2;i<=n;i++)
		{
			if(n==1 || n==i)
			{
				System.out.println("Prime hi hai number so ja aab");
				break;
			}
			else if((n%i)==0)
			{
				System.out.println("Number gaddar nikla prime nahi hai");
				break;
			}
		}
	}
}
