package com.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorInterfaceEx {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("abc");
		list.add("pqr");
		list.add("xyz");
		
		//iterator interface 
		Iterator<String> itr = list.iterator();
		while(itr.hasNext())
		{
			String ele = itr.next();
			System.out.println(ele);
		}

	}

}
