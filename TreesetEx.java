package com.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class TreesetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> t1 = new TreeSet<>();
		
		//add
		t1.add("hello");
		t1.add("Hii");
		t1.add("bye");
		
		//traverse
		Iterator<String> itr = t1.iterator();
		while(itr.hasNext())
		{
			String element = itr.next();
			System.out.println(element);
		}
		

	}

}
