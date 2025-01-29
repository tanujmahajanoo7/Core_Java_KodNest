package com.kodnest.comparator.method1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.kodnest.comparable.Employee;
import com.kodnest.comparatorm.Person;

public class Demo {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(new Person1("Suhani",25));
		al.add(new Person1("Sindhu",23));
		al.add(new Person1("Sahana",22));
		al.add(new Person1("Sushila",26));
		al.add(new Person1("Shruthi",24));
		System.out.println("Before sorting: "+ al);
//		Creating Annonymous inner type object of comparator -----------------------------------
		Comparator ref = new Comparator() {
			public int compare(Object o1,Object o2) {
				Person1 p1=(Person1)o1;
				Person1 p2=(Person1)o2;
				if((p1.age)>(p2.age)) {
					return 1;
				}
				else {
					return -1;
				}
			}
		};
		Collections.sort(al,ref);
		System.out.println("After sorting: "+ al);	
	}
}
