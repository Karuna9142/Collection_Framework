package com.hashmap;
import java.util.HashMap;

public class HashMapNullEx 
{
	public static void main(String[] args) {

	HashMap<Integer, String> hs = new HashMap<>();
	hs.put(1, "Karuna");
	hs.put(2, "Ritika");
	hs.put(3, "Riya");
	hs.put(4, "Kriti");
	hs.put(null, "Smriti");
	
	System.out.println(hs);
	System.out.println(hs.get(2));
	System.out.println(hs.get(3));
	
	hs.remove(3);
	hs.put(6, "Priti");
	System.out.println(hs);
	System.out.println(hs.isEmpty());
	System.out.println(hs.containsKey(null));
	System.out.println(hs.containsValue("Riya"));
	
	}
}
