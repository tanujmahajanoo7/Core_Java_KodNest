package DeadLockSolution;

public class Warrior implements Runnable {
	String astra1 = "Sarpastra";
	String astra2 = "Bhramastra";
	String astra3 = "Pashupatastra";
	
	@Override
	public void run() {
		if(Thread.currentThread().getName().equals("karna")) {
			karnaAcquireResource();
		}
		else {
			arjunaAcquireResource();
		}
	}
	
	void karnaAcquireResource() {
		try {
			Thread.sleep(2000);
			synchronized (astra1) {
				System.out.println(Thread.currentThread().getName()+" Has aquired astra-1 " + astra1);
				Thread.sleep(2000);
				synchronized (astra2) {
					System.out.println(Thread.currentThread().getName()+" Has aquired astra-2 " + astra2);	
					Thread.sleep(2000);
					synchronized (astra3) {
						System.out.println(Thread.currentThread().getName()+" Has aquired astra-3 " + astra3);			
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	void arjunaAcquireResource() {
		try {
			Thread.sleep(2000);
			synchronized (astra3) {
				System.out.println(Thread.currentThread().getName()+" Has aquired astra-3 " + astra3);
				Thread.sleep(2000);
				synchronized (astra2) {
					System.out.println(Thread.currentThread().getName()+" Has aquired astra-2 " + astra2);	
					Thread.sleep(2000);
					synchronized (astra1) {
						System.out.println(Thread.currentThread().getName()+" Has aquired astra-1 " + astra1);			
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
