package com.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapBookEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Double> h1 = new HashMap<>();
		h1.put("Math", 250.6);
		h1.put("DBMS", 450.6);
		h1.put("C++", 550.6);
		h1.put("Java", 500.50);
		
		System.out.println(h1);
		
		System.out.println(h1.entrySet());
		
		for(String i: h1.keySet())
		{
			System.out.println("String value:- "+i);
		}
		for(Object d: h1.values())
		{
			System.out.println("Double value:- "+d);
		}
		
		Set<Map.Entry<String, Double>> s = h1.entrySet();
		
		for(Map.Entry<String, Double> it:s)
		{
			System.out.println(it.getKey()+" "+it.getValue());
		}


	}

}
