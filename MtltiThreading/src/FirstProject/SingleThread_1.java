package FirstProject;

import java.util.Scanner;

public class SingleThread_1 {
	public static void main(String[] args) {
		try {
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
			
			System.out.println("Multiplication activity started");
			int a =10;
			int b=2;
			Thread.sleep(5000);
			System.out.println("Result" + a*b);
			System.out.println("Multiplication activity ended");
			
			System.out.println("Searching activity started");
			int[] arr= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
			int key=15;
			for(int i=0;i<arr.length-1;i++) {
				if(key==arr[i]) {
					System.out.println("Key found at " + i);
					Thread.sleep(5000);
					break;
				}
				Thread.sleep(5000);
			}
			System.out.println("Searching activity ended");
			sc.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
