package com.kodnest.collection.treeset;

import java.util.Iterator;
import java.util.TreeSet;
public class Demo {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet<>();
		ts.add(100);
		ts.add(200);
		ts.add(300);
		ts.add(500);
		ts.add(400);
		System.out.println(ts);
		Iterator it = ts.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
	