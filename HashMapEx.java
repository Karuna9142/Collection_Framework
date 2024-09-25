package com.hashmap;
import java.util.HashMap;

public class HashMapEx {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hs = new HashMap<>();
		hs.put(1, "Karuna");
		hs.put(2, "Ritika");
		hs.put(3, "Riya");
		hs.put(4, "Kriti");

		System.out.println(hs);
		
		System.out.println(hs.get(2));
		System.out.println(hs);
		
		//isEmplty
		System.out.println(hs.isEmpty());
		System.out.println(hs);
		
		//remove
		hs.remove(1);
		System.out.println(hs);
		
		//size
		hs.size();
		System.out.println(hs);
		
		//contains
		hs.containsKey("abc");
		System.out.println(hs);
		
		

	}

}
