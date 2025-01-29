package Syncronization;

public class BathRoom implements Runnable {
	@Override
	synchronized public void run() {
		try {
			System.out.println(Thread.currentThread().getName() + " Is entering bathroom");
			Thread.sleep(3000);

			System.out.println(Thread.currentThread().getName() + " Is using bathroom");
			Thread.sleep(3000);
			
			System.out.println(Thread.currentThread().getName() + " Is exit from bathroom");
			Thread.sleep(3000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}
