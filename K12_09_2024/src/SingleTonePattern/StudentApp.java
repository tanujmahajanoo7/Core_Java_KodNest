package SingleTonePattern;

class Student {
	String name;
	int age;
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void study() {
		System.out.println(name + " student is stydying ");
	}
}

public class StudentApp {

	public static void main(String[] args) {
		Student s1 = new Student("Omkar",20);
		System.out.println(s1);
		s1.study();
		
		Student s2 = new Student("Pralladh",22);
		System.out.println(s2);
		s2.study();
		
		Student s3 = s2;
		System.out.println(s3);
		s3.study();
		
		
	}

}
