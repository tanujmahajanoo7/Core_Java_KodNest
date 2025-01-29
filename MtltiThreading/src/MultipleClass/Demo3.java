package MultipleClass;

public class Demo3 extends Thread{
	@Override
	public void run() {
		try {
			System.out.println("Searching activity started");
			int[] arr= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
			int key=15;
			for(int i=0;i<arr.length-1;i++) {
				if(key==arr[i]) {
					System.out.println("Key found at " + i);
					Thread.sleep(5000);
					break;
				}
				Thread.sleep(5000);
			}
			System.out.println("Searching activity ended");			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
