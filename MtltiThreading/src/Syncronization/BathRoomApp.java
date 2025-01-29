package Syncronization;

public class BathRoomApp {

	public static void main(String[] args) {
		BathRoom b = new BathRoom();
		
		Thread t1 = new Thread(b);
		Thread t2 = new Thread(b);
		Thread t3 = new Thread(b);
		
		t1.setName("Boy");
		t2.setName("Girl");
		t3.setName("Other");
		
		t1.start();
		t2.start();
		t3.start();
	}

}
