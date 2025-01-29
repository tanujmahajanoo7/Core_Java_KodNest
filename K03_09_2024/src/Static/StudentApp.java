package Static;

class Student {
	String name;
	int age;
	static int count = 0 ;
	public Student() {
		count++;
	}
}

public class StudentApp {
	public static void main(String arg[])
	{
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		System.out.println("No of object created or number of students: " + Student.count);
	}
}
