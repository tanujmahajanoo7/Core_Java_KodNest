import java.util.Scanner;

public class SimpleArr {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		
		System.out.println("Enter number of value (count):");
		
		n = scan.nextInt();
		
		int arr [] = new int[n];
		
		System.out.println("Enter value upto " + n);
		
		for(int i=0;i<n;i++)
		{
			int a = scan.nextInt();
			arr[i]=a;
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}		
	}
}
