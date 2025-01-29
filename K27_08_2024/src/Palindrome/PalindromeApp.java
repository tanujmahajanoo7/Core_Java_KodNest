package Palindrome;

import java.util.Scanner;

public class PalindromeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		Palindrome p = new Palindrome();
		
		int n = scan.nextInt();
		if(p.ispalindrome(n))
		{
			System.out.println("Yes");
		}
		else 
		{
			System.out.println("No");
		}
	}

}
