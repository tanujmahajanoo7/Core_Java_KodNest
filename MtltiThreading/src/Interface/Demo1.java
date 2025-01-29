package Interface;

import java.util.Scanner;

public class Demo1 implements Runnable {
	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Typing activity started");
		String sen = "";
		for(int i=0;i<5;i++) {
			System.out.println("Enter word");
			String word = sc.next();
			sen+=word;
		}
		System.out.println(sen);		
		System.out.println("Typing activity ended");
		sc.close();
	}
}
