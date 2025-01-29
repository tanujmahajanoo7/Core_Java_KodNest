package SerializationDeserialization;

import java.io.Serializable;

public class Student implements Serializable{
	String name;
	int age;
	String gender;
	int marks;
	transient int password;
	
	public Student (String name, int age, String gender, int marks, int password) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.marks = marks;
		this.password = password;
	}
	
	@Override
	public String toString() {
		return name + " " + age + " " + gender + " " + marks + " " + password;
	}
}
