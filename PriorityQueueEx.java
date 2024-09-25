package com.priorityquequEx;
import java.util.PriorityQueue;

public class PriorityQueueEx {

	public static void main(String[] args) {
		
		PriorityQueue q = new PriorityQueue();
		
		q.add(1);
		q.add(2);
		q.add(34);
		q.add(40);
		q.add(27);
		
		//q.offer('A');
		//.add('a');
		
		System.out.println(q);
		System.out.println(q.size());
		
		System.out.println("Return front element:- "+q.element());
		System.out.println("After using element method:- "+q);
		
		//System.out.println("return front peek- "+q.peek());
		//System.out.println("After using element method:- "+q);

	}

}
