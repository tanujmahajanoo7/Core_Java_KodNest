import java.util.Scanner;
public class Largestof2Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		scan.close();
		if(a>b)
			System.out.println("Largest Number = "+a);
		else
			System.out.println("Largest Number = "+b);
			
	}

}
