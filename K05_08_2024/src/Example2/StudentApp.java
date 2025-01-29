package Example2;

public class StudentApp {
	
	public static void main(String[] args)
	{
		// Initialize the Student object
		Student student = new Student();
		System.out.println("Student id " + student.id);		
		System.out.println("Student name " + student.name);		
		System.out.println("Student gender " + student.gender);
		student.eat();
		student.sleep();
		student.study();
		System.out.println("---------------------------------------------------------------");
		System.out.println("Brain properties" + student.brain.color);
		System.out.println("Brain properties" + student.brain.weight);
		student.brain.think();
		System.out.println("Heart properties" + student.heart.color);
		System.out.println("Heart properties" + student.heart.weight);
		student.heart.pumpBlood();
		System.out.println("---------------------------------------------------------------");
		Book book = new Book();
		Car car = new Car();
		student.sbook(book);
		student.scar(car);
		System.out.println("---------------------------------------------------------------");		
			
	}	
}
