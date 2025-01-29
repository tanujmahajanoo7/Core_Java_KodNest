package SimgleClass;

public class MultiThreadDemo {

	public static void main(String[] args) {
		
//		Creating object of thread type
		Demo d1 = new Demo();
		Demo d2 = new Demo();
		Demo d3 = new Demo();
		
		d1.setName("type");
		d2.setName("multiply");
		d3.setName("search");
		
		d1.start();
		d2.start();
		d3.start();
		
	}
}
