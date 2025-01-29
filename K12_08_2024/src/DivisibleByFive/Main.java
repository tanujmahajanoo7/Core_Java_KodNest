package DivisibleByFive;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		scan.close();
		DivisibleBy5 d = new DivisibleBy5();
		d.divisible(a);
	}
}
