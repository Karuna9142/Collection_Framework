package com.priorityquequEx;
import java.util.PriorityQueue;

public class PriorityQueueEx1 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		PriorityQueue p1 = new PriorityQueue();
		
		p1.add("Java");
		p1.add("Python");
		
		p1.add("C");
		p1.add("C++");
		
	    p1.add("PHP");
	    p1.add("JavaScript");
	    
	    System.out.println(p1);
	    
	    p1.offer("Html");
	    p1.add("Css");
	    System.out.println(p1);
	    
	    //peek()
	    System.out.println("Front  element is:- "+p1.peek());
	    
	    //poll
	    System.out.println("Poll:- "+p1.poll());
	    
	    //element
	    System.out.println("thr front element is:- "+p1.element());
	    
	    //remove
	    System.out.println("after removing value:- "+p1.remove());
	}

}
