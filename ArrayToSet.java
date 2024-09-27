package com.hashmap;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ArrayToSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[]arr = {1,2,3,4,5};
		
		Set<Integer> set = new HashSet<>();
		
		Collections.addAll(set, arr);
		System.out.println("Converted Set:- "+set);

	}

}
