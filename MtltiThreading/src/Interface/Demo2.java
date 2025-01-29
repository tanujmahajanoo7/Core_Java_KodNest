package Interface;

public class Demo2 implements Runnable{
	@Override
	public void run() {
		try {
			System.out.println("Multiplication activity started");
			int a =10;
			int b=2;
			Thread.sleep(5000);
			System.out.println("Result" + a*b);
			System.out.println("Multiplication activity ended");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
