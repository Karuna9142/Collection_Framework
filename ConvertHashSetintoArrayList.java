package com.setInterface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class ConvertHashSetintoArrayList {

	public static void main(String[] args) 
	{
		HashSet<Integer> h1 = new HashSet();
		
		h1.add(4);
		h1.add(34);
		h1.add(7);
		h1.add(6);
		h1.add(56);
		
		System.out.println(h1);
		
		//convert into arraylist
		ArrayList<Integer> a1 = new ArrayList<>(h1);
		a1.add(4);
		a1.add(67);
		a1.add(48);
		a1.add(24);
		a1.add(43);
		a1.add(4);
		
		System.out.println(a1);
		
		Collections.sort(a1);
		System.out.println("After sorting:- "+a1);
		

	}

}
