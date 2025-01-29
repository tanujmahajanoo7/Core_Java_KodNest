public class StudentHasApp {
	public static void main(String[] args) { 
		Student student=new Student(); 
		System.out.println(student.name+" BRAIN PROPERTIES: "+student.brain.color+" "+student.brain.weight); 
		System.out.println(student.name+" HEART PROPERTIES: "+student.heart.color+" "+student.heart.weight); 
		student.brain.think(); student.heart.pumpBlood(); 
		System.out.println("==================================="); 
		Book book=new Book(); Car car=new Car(); 
		student.hasBook(book); student.hasCar(car); 
		System.out.println("================================"); 
		student=null;
	}
}

//System.out.println(student.brain.color+" "+student.heart.weight); System.out.println(book.title+" "+car.brand); } }