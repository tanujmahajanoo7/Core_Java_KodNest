package com.kodnest.ds.arraylist;

import java.io.Serializable;
import java.util.ArrayList;

public class Demo {
	public static void main(String[] args) {
		ArrayList<Serializable> al1 = new ArrayList<Serializable>();
		ArrayList<String> al2 = new ArrayList<String>();
		System.out.println("Size of al1 is: " + al1.size());
		al1.add(100);
		al1.add(200);
		al1.add(300);
		al1.add(400);
		al1.add(500);
		System.out.println("Size of al1 is: " + al1.size());
		System.out.println("Size of al1 is: " + al2.size());
		al2.add("Aman");
		al2.add("Sham");
		al2.add("Samir");
		al2.add("Ritik");
		ArrayList<String> al3= new ArrayList<String>();
		al3.add("Aman");
		al3.add("Sham");
		al3.add("Samir");
		al3.add("Ritik");
		System.out.println("Size of al1 is: " + al2.size());
		al1.addAll(al2);
		System.out.println("After adding all al2 elements in al1: " + al1);
		al1.removeAll(al2);
		System.out.println("after removing all elements of al2 from al1 : " + al1);
//		al2.addAll(al1);
//		System.out.println("After adding all al2 elements in al1: " + al2);
		
		System.out.println("Is al3 contain \"Aman\" elements of al1 : " + al2.contains("Aman"));
		System.out.println("Is al3 contain all elements of al1 : " + al2.containsAll(al3));
		
		
		System.out.println("Index of \"100\" is : " + al1.indexOf(100));
		System.out.println("Index of \"200\" is : " + al1.indexOf(200));
		
		System.out.println("al1 is empty: " + al1.isEmpty());
		
		System.out.println(al1);
		System.out.println(al2);
		System.out.println(al3);
		System.out.println("After using set method");
		al1.set(0, al3);
		System.out.println(al1);
		System.out.println("Element at 0 index is " + al1.get(0));
		
	}
}
