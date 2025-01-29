package Join;

public class MultiThreadDemo {

	public static void main(String[] args) {
		System.out.println("Main thread started and resources allocated!");
		try {
//			Creating object of thread type
			Demo d1 = new Demo();
			
			Thread t1 = new Thread(d1);
			Thread t2 = new Thread(d1);
			Thread t3 = new Thread(d1);
			
			
			t1.setName("type");
			t2.setName("multiply");
			t3.setName("search");
			
			t1.start();
			t2.start();
			t3.start();
			
			t1.join();
			t2.join();
			t3.join();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Main thread started and resources deallocated!");
	}
}
