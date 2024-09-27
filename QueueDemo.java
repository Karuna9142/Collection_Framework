package com.priorityquequEx;

import java.util.Comparator;
import java.util.PriorityQueue;

public class QueueDemo {

	public static void main(String[] args) {
		
		//can't create instance of queuq because it is an interface
		PriorityQueue<String> q1 =
				new PriorityQueue<String>(15, new MyComparator());
		
		q1.add("abc");
		q1.add("pqr");
		q1.add("kkm");
		q1.add("skm");
		q1.add("pkm");
		
		while(q1.size()!=0)
		{
			System.out.println(q1.poll());
		}

	}

}
