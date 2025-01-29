package Error;

public class Demo {
	public static void main(String[] args) {
		System.out.println("Started");
		add(10,10);
		System.out.println("Ended");
	}
	
	public static void add(int a, int b) {
		try {
			System.out.println(a+b);
			add(20,20);			
		}
		catch (Error e) {
			System.out.println(e);
		}
	}
}
