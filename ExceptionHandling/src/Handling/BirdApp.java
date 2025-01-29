package Handling;

public class BirdApp {

	public static void main(String[] args) {
		Eagle eagle = new Eagle();
		eagle.fly();
	}

}

//1. Overriden method may throw same exception or may not throw the exception at all
//2. Overriden method can't throw different exception when compared with parent if the exception is checked exception 
//3. Overriden method may throw differnent exception provided there exist IS-A relationship between them
//4. Overriden method may throw differnent exception and does not follow IS-A relationship rule provided the exceptions are unchecked exception 