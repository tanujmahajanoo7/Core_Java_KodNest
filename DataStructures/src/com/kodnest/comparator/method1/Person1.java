package com.kodnest.comparator.method1;
import java.util.Objects;

public class Person1 {
	String name;
	int age;
	public Person1(String name, int age) {
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
		Person1 p = (Person1)obj;
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
