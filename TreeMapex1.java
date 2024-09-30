package com.treeMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapex1 {

	public static void main(String[] args) {
		
		TreeMap<Integer,String> treeMap = new TreeMap<>();
		
		treeMap.put(3, "Three");
		treeMap.put(1, "One");
		treeMap.put(2, "Two");
		System.out.println("TreeMap: " + treeMap);
		
		// Retrieving values
		String value = treeMap.get(2);
		System.out.println("Value for key 2: " + value);
		
		// Removing an entry
		treeMap.remove(1);
		System.out.println("TreeMap after removing key 1: " + treeMap);
		
		// Iterating through keySet
		System.out.println("Keys:");
		for (Integer key : treeMap.keySet()) {
		System.out.println(key);
		}
		
		// Iterating through values
		System.out.println("Values:");
		for (String val : treeMap.values()) {
		System.out.println(val);
		}
		
		// Iterating through entrySet
		System.out.println("Key-Value Pairs:");
		for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
		System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		
		// First and last keys
		Integer firstKey = treeMap.firstKey();
		Integer lastKey = treeMap.lastKey();
		System.out.println("First Key: " + firstKey);
		System.out.println("Last Key: " + lastKey);
		
		// Higher, lower, ceiling, and floor keys
		Integer higherKey = treeMap.higherKey(1);
		Integer lowerKey = treeMap.lowerKey(3);
		Integer ceilingKey = treeMap.ceilingKey(2);
		Integer floorKey = treeMap.floorKey(2);
		
		System.out.println("Higher Key than 1: " + higherKey);
		System.out.println("Lower Key than 3: " + lowerKey);
		System.out.println("Ceiling Key than 2: " + ceilingKey);
		System.out.println("Floor Key than 2: " + floorKey);
		

	}

}
