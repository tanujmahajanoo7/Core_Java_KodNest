package ProducerConsumerProblem;

public class Consumer extends Thread{
	Factory fref;
	
	public Consumer(Factory fref) {
		super();
		this.fref = fref;
	}
	@Override
	public void run() {
		while(true) {
			fref.getX();
		}
	}
}
