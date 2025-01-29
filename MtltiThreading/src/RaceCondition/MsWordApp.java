package RaceCondition;

public class MsWordApp {

	public static void main(String[] args) {
		Msword msword = new Msword();
		
		Thread t1 = new Thread(msword);
		Thread t2 = new Thread(msword);
		Thread t3 = new Thread(msword);
		
		t1.setName("type");
		t2.setName("spell");
		t3.setName("save");
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}