package ProducerConsumerProblem;

public class Factory {
	int x;
	boolean isProduced = false;
	
	synchronized public void setX(int x) {
		try {
			if(isProduced==true) {
				wait();
			}
			this.x = x;
			System.out.println("Producer had produced " + x + " in factory");
			isProduced = true;
			notify();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	synchronized public void getX() {
		try {
			if(isProduced==false) {
				wait();
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
