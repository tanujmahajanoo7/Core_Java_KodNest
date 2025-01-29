package com.kodnest.comparatorm;

import java.util.ArrayList;
import java.util.Collections;

import com.kodnest.comparable.Employee;

public class Demo {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(new Person("Suhani",25));
		al.add(new Person("Sindhu",23));
		al.add(new Person("Sahana",22));
		al.add(new Person("Shruthi",24));
		al.add(new Person("Sushila",26));
		System.out.println("Before sorting: "+ al);
		Collections.sort(al,new Comparing());
		System.out.println("After sorting: "+ al);	
	}

}
