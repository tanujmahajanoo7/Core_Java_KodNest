package com.kodnest.HashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapImplementation {
	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put(10,new Employee("Omkar",20));
		hm.put(12,new Employee("Suchil",22));
		hm.put(11,new Employee("Samir",21));
		hm.put(13,new Employee("kalki",23));
		System.out.println(hm);
		
		HashMap<String,Integer> hm2 = new HashMap<String,Integer>();
		hm2.put("A", 100);
		hm2.put("B", 50);
		hm2.put("C", 10);
		hm2.put("D", 20);
		System.out.println(hm2);
		
		LinkedHashMap<Integer,Employee> hm3 = new LinkedHashMap<Integer,Employee>();
		hm3.put(10,new Employee("Omkar",20));
		hm3.put(12,new Employee("Suchil",22));
		hm3.put(11,new Employee("Samir",21));
		hm3.put(13,new Employee("kalki",23));
		System.out.println(hm3);
		
		TreeMap<Integer,Employee> hm4 = new TreeMap<Integer,Employee>();
		hm4.put(10,new Employee("Omkar",20));
		hm4.put(12,new Employee("Suchil",22));
		hm4.put(11,new Employee("Samir",21));
		hm4.put(13,new Employee("kalki",23));
		System.out.println(hm4);
		
		Map<Integer,String> hm5 = new HashMap<Integer,String>();
		hm5.put(10, "A");
		hm5.put(20, "B");
		hm5.put(30, "C");
		hm5.put(40, "D");
		System.out.println(hm5);
		
		Set s = hm5.keySet();
		Iterator itr = s.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		System.out.println();
		
		Collection c = hm5.values();
		itr = c.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		System.out.println();
		
		Set es = hm5.entrySet();
		itr = es.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		System.out.println();
	}
}
