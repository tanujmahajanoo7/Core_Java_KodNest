package SimgleClass;

import java.util.Scanner;

public class Demo extends Thread {

	@Override
	public void run() {
		Thread t = Thread.currentThread();
		String name = t.getName();
		if(name.equals("type")) {
			typping();
		}
		else if(name.equals("multiply")) {
			multiply();
		}
		else {
			search();
		}
	}
	public void typping() {
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
	public void multiply() {
		try {
			System.out.println("Multiplication activity started");
			int a =10;
			int b=2;
			Thread.sleep(5000);
			System.out.println("Result: " + a*b);
			System.out.println("Multiplication activity ended");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void search() {
		try {
			System.out.println("Searching activity started");
			int[] arr= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
			int key=15;
			for(int i=0;i<arr.length-1;i++) {
				if(key==arr[i]) {
					System.out.println("Key found at " + i);
					Thread.sleep(5000);
					break;
				}
				Thread.sleep(2000);
			}
			System.out.println("Searching activity ended");			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
