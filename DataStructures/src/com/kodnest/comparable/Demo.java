package com.kodnest.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Demo {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(new Employee("Sahana",22));
		al.add(new Employee("Sindhu",23));
		al.add(new Employee("Shruthi",24));
		al.add(new Employee("Suhani",25));
		al.add(new Employee("Sushila",26));
		System.out.println("Before sorting: "+ al);
		Collections.sort(al);
		System.out.println("After sorting: "+ al);		
	}

}
