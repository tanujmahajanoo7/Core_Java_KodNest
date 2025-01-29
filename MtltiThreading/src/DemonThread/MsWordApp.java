package DemonThread;

public class MsWordApp {

	public static void main(String[] args) {
		Msword msword = new Msword();
		
		Thread t1 = new Thread(msword);
		Thread t2 = new Thread(msword);
		Thread t3 = new Thread(msword);
		
		t1.setName("type");
		t2.setName("spell");
		t3.setName("save");
		
//		1. make thread associated background activity with demon thread
		t2.setDaemon(true);
		t3.setDaemon(true);
		
//		2.Reduce the priority of demon thread
		t2.setPriority(8);
		t3.setPriority(9);
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}