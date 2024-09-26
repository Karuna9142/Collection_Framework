package com.hashmap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashDemo {

	public static void main(String[] args) {
		
		HashMap<Integer,String> h1 = new HashMap<>();
		h1.put(1, "Meenu");
		h1.put(2, "Bob");
		h1.put(7, "Baby");
		h1.put(6, "Soni");
		h1.put(9, "Geeta");
		
		System.out.println(h1);
		
		System.out.println(h1.entrySet());
		
		for(int i: h1.keySet())
		{
			System.out.println("Integer value:- "+i);
		}
		for(Object string: h1.values())
		{
			System.out.println("String value:- "+string);
		}
		
		Set<Map.Entry<Integer,String>> s = h1.entrySet();
		
		for(Map.Entry<Integer, String> it:s)
		{
			System.out.println(it.getKey()+" "+it.getValue());
		}

	}

	//book ka hash map bnega do restric String and double 
	//String book ka name and double me book ka price
}
