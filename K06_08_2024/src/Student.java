public class Student { 
	int id=1; 
	String name="Omkar"; 
	String gender="Male"; 
	Brain brain=new Brain(); 
	Heart heart=new Heart(); 
	void eat() { 
		System.out.println("Student is Eating"); 
		} 
	void sleep() { 
		System.out.println("Student is Sleeping"); 
		} 
	void study() {
		System.out.println("Student is Studying"); 
		}
	void hasBook(Book ref1) { 
		System.out.println(ref1.title+" "+ref1.author+" "+ref1.price); 
		System.out.print(name+" "); 
		ref1.userRead(); 
		} 
	void hasCar(Car ref2) { 
		System.out.println(ref2.brand+" "+ref2.color+" "+ref2.cost); 
		System.out.print(name+" "); ref2.userDrive(); 
		} 
	}