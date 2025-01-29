package ProducerConsumerProblem;

public class PCProblem {
	public static void main(String[] args) {
		Factory factory = new Factory();
		Producer producer = new Producer	(factory);
		Consumer consumer = new Consumer(factory);
		producer.start();
		consumer.start();
	}
}
