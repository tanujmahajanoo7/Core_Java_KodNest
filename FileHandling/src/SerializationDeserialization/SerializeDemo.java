package SerializationDeserialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeDemo {
	public static void main(String[] args) {
		try {
			String path = "F:\\filesprogram\\persist.txt";
//			Serialization
//			Student s = new Student("Ramesh", 23, "male" , 90, 1234);
//			System.out.println(s);
//			System.out.println("Go to file and check");
//			FileOutputStream fos = new FileOutputStream(path);
//			ObjectOutputStream oos = new ObjectOutputStream(fos);
//			oos.writeObject(s);
//			System.out.println("Serilazation Complete");
			
//			DeSerialization
//			FileInputStream fis = new FileInputStream(path);
//			ObjectInputStream ois = new ObjectInputStream(fis);
//			Student s = (Student) ois.readObject();
//			System.out.println(s);
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
