package com.arraydeque;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class ArrayDequeEx {

	public static void main(String[] args) {
		
		//Creating Deque
		Deque<String> d1 = new ArrayDeque<String>();
		d1.add("kkm");
		d1.add("pkm");
		d1.add("skm");
		
		Iterator<String>itr = d1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
