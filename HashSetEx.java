package com.hashmap;

import java.util.HashSet;

public class HashSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set=new HashSet<String>();  
		set.add("Ravi");  
		set.add("Vijay");  
		set.add("Ravi");  
		set.add("Ajay");  
		//duplicates are not allowed
		//System.out.println(set);
		for(String obj:set)
		{
			System.out.println(obj);
		}

	}

}
