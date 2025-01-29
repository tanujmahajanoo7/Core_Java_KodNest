package UserDefineMethod;

import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Connection Occoured");
		try {
			int a=sc.nextInt(); //10
			int b=sc.nextInt(); //0
			int c = a/b;
			System.out.println(c);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("Connection Terminated");
	}
}
