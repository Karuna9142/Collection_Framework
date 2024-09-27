package com.stack;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
		Stack<Integer> s1 = new Stack<Integer>();
		s1.push(12);
		s1.add(45);
		s1.push(47);
		s1.add(8);
		s1.push(120);
		
		System.out.println(s1);
		
		//pop
		s1.pop();
		System.out.println(s1);
		
		//isEmpty
		System.out.println(s1.isEmpty());
		
		

	}

}
