package com.vector;
import java.util.Iterator;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		
		Vector<String>v = new Vector<String>();
		v.add("Java");
		v.add("Python");
		v.add("C++");
		v.add("PHP");
		v.add("Html");
		
		Iterator itr = v.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		

	}

}
