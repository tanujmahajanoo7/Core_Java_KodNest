package DeadLock;

public class WarriorApp {

	public static void main(String[] args) {
		
		Warrior w = new Warrior();

		Thread t1 = new Thread(w);
		Thread t2 = new Thread(w);
		Thread t3 = new Thread(w);
		
		t1.setName("Karna");
		t2.setName("Arjuna");
		
		t1.start();
		t2.start();

	}
}
