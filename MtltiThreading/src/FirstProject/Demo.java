package FirstProject;

public class Demo {
	public static void main(String[] args) {
		System.out.println("Hello");
		Thread t = Thread.currentThread();
//		System.out.println(t);
//		t.setName("KodNest");
//		t.setPriority(4);    //1 highest 10 lowest priority
//		System.out.println(t);
		
		t.setPriority(Thread.MIN_PRIORITY);
		System.out.println(t);
		t.setPriority(Thread.NORM_PRIORITY);
		System.out.println(t);
		t.setPriority(Thread.MAX_PRIORITY);
		System.out.println(t);
	}
}
