package K11_07_2024;

import java.util.Scanner;

public class validChar {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Enter character : ");
		char a=scan.next().charAt(0);
		
		if(a=='a' || a=='e' || a=='o' || a=='i' || a=='u' || a=='A' || a=='E' || a=='I' || a=='O' || a=='U')
			System.out.println("Entered Character " + a + " is voule");
		else if(a>='a' && a<='z' || a>='A' && a<='Z')
			System.out.println(a+" is not a consonent");
		else
			System.out.println("Invalid Charcter");
		
	}

}
