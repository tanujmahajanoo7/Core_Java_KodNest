package CustomisedException;

import java.util.Scanner;

public class ATM {
	public void withdraw() throws InvalidUserIdPasswordException {
		
		Scanner sc = new Scanner(System.in);
		int uid = 1111;
		int upwd = 2222;
		
		System.out.println("Enter user id and password");
		
		int id = sc.nextInt();
		int pwd = sc.nextInt();
		
		if(uid == id && upwd == pwd) {
			System.out.println("Collect your money");
		}
		else {
			InvalidUserIdPasswordException e = new InvalidUserIdPasswordException();
			System.out.println(e.getMessage());
			throw e;
		}		
	}
}
