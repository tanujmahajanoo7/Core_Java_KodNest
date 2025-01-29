import java.util.Scanner;

public class StudentNames {

	public static void main(String[] args) {
		System.out.println("Enter the number of students");
		int n;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		scan.nextLine();	
		
		String arr[] = new String[n];
		
		for(int i=0;i<n;i++)
		{
			String name = scan.nextLine();
			arr[i]=name;
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Student " + i + " name is: " + arr[i]);
		}
	}

}
