package com.treeMap;

import java.util.TreeMap;

public class TreeMapEx {

	public static void main(String[] args) {
		
		//created a TreeMap
		TreeMap<String,Integer> t1 = new TreeMap<>();
		t1.put("kkm", 101);
		t1.put("skm", 102);
		t1.put("pkm", 103);
		
		//original value
		System.out.println(t1);
		
		//get method
		System.out.println(t1.get("kkm"));
		
		//firstKey
		System.out.println(t1.firstKey());
		
		//lastKey
		System.out.println(t1.lastKey());
		
		//updated key
		System.out.println(t1);
		

	}

}
