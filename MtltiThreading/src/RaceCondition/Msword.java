package RaceCondition;

public class Msword implements Runnable {

	
	@Override
	public void run() {
		if(Thread.currentThread().getName().equals("type")) {
			typping();
		}
		else if(Thread.currentThread().getName().equals("spell")) {
			spellcheck();
		}
		else if(Thread.currentThread().getName().equals("save")) {
			autosaving();
		}
	}
	
	public void typping() {
		try {
			for(int i=0;i<5;i++) {
				System.out.println("Typping");
				Thread.sleep(5000);
			}			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void spellcheck() {
		try {
			for(int i=0;i<5;i++) {
				System.out.println("Spell checking");
				Thread.sleep(5000);
			}			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void autosaving() {
		try {
			for(int i=0;i<5;i++) {
				System.out.println("Auto saving");
				Thread.sleep(5000);
			}			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
