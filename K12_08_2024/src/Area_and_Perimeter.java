import java.util.Scanner;
public class Area_and_Perimeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int length = scan.nextInt();
		int breadth = scan.nextInt();
		scan.close();
		
		int area = length * breadth;
		System.out.print("Area = " + area);
		int perimeter = 2*(length+breadth);
		System.out.println(" Perimeter = " + perimeter);
	}
}