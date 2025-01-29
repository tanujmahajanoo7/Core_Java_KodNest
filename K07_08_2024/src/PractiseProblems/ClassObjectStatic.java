package PractiseProblems;

class Student
{
	String name;
	int roll;
	int marks;
	static int totalNumberOfStudents=1;
	
	void setter(String name,int roll,int marks)
	{
		this.name=name;
		this.roll=roll;
		this.marks=marks;
		totalNumberOfStudents++;
	}
	
	void getter()
	{
		System.out.println("Student name is "+ name + "." + " His roll number is "+roll+" and he obtatin "+ marks +" marks."+" Out of "+ totalNumberOfStudents + " students");
	}
	
	void total()
	{
		System.out.println("Total number of studetns are " + totalNumberOfStudents);
	}
}


public class ClassObjectStatic {
	public static void main(String[] args)
	{
//		Student.setter("Aman",1,80);
		Student s1=new Student();
		s1.name="abc";
		s1.roll=1;
		s1.marks=80;
		s1.getter();
		
		Student s2=new Student();
		s2.setter("def", 2, 79);
		s2.getter();
		
		Student s3=new Student();
		s3.setter("ghi", 3, 84);
		
		Student s4 = new Student();
		s4.setter("jkl",4,87);
		s4.getter();
		s4.total();
	}
}
