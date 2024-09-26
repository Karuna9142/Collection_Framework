package com.stack;
import java.util.Iterator;
import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s1 = new Stack();
		s1.add("Karuna");
		s1.push("Priya");
		s1.push("Siya");
		s1.add("abhi");
		s1.add("meenu");
		
		
		Iterator itr = s1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		//search
		System.out.println(s1.search("meenu"));
		
		//peek
		System.out.println(s1.peek());
		//pop
		s1.pop();
		s1.pop();
		System.out.println(s1);
		

	}

}
