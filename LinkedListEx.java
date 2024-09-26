package com.linkedHashSetex;

import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> l1=new LinkedList<String>();

		l1.add("Alice");
		l1.add("Bob");
		l1.add("Charlie");
		l1.add("Bobi");
		l1.add("Baby");
		
		System.out.println(l1);
		
		//l1.addFirst("Radhe");
		//System.out.println(l1);
		
		//l1.addLast("Krishna");
		//System.out.println(l1);
		
		//l1.clone();
		//System.out.println(l1);
		
		//l1.contains("Bob");
		//System.out.println(l1);
		
		l1.poll();
		System.out.println(l1);
		
		l1.pollFirst();
		System.out.println(l1);
		
		l1.get(2);
		System.out.println(l1);
		
		l1.getFirst();
		System.out.println(l1);
		
		l1.clear();
		System.out.println(l1);
	}

}
