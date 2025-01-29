package com.kodnest.comparatorm;
import java.util.Objects;

public class Person {
	String name;
	int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return name+" "+age;
	}
	
	public boolean equals(Object obj) {
		if(obj==null || this.getClass()!=obj.getClass()) {
			return false;
		}
		Person p = (Person)obj;
		if(this.name.equals(p.name) && this.age==p.age) {
			return true;
		}
		else {
			return false;
		}
	}
	public int hashCode() {
		return Objects.hash(name,age);
	}
	
}
