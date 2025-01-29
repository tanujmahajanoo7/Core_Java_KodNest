package com.kodnest.weakhashmap.IdentityHashMap;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map m = new WeakHashMap();
		Integer key1 = new Integer(100);
		Integer key2 = new Integer(200);
		m.put(key1, "Value1");
		m.put(key2, "Value2");
		System.out.println(m);
		key2=null;
		System.gc(); //Calling garbage collector
		for(int i=1;i<=10;i++) {
			System.out.println("");
		}
		System.out.println("After garbage collection");
		System.out.println(m);
		
		HashMap hm = new HashMap();
		String s1 = new String ("Key1");
		String s2 = new String ("Key2");
		String s3 = new String ("Key3");
		String s4 = new String ("Key1");
		hm.put(s1,"Value1");
		hm.put(s2,"Value2");
		hm.put(s3,"Value3");
		hm.put(s4,"Value4");
		System.out.println(hm);
		
		Map hm2 = new IdentityHashMap();
		hm2.put(s1,"Value1");
		hm2.put(s2,"Value2");
		hm2.put(s3,"Value3");
		hm2.put(s4,"Value4");
		System.out.println(hm2);
		
				
	}

}
