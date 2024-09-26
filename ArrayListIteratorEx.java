package com.arrayList;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteratorEx {

	public static void main(String[] args) {
	
		ArrayList a1 = new ArrayList();
		a1.add(2);
		a1.add(3);
		a1.add(4);
		a1.add(5);
		a1.add(6);
		a1.add(7);
		
		//Traversing list through iterator
		Iterator itr = a1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		

	}

}
