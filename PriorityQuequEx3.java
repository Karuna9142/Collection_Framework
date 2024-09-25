package com.priorityquequEx;
import java.util.PriorityQueue;

public class PriorityQuequEx3 {

	public static void main(String[] args) {
		
		PriorityQueue p1 = new PriorityQueue();
		
		
		p1.add("Apple");
		p1.add("Orange");
		p1.add("Grapes");
		p1.add("Banana");
	    p1.add("Papaya");
	    
	    System.out.println(p1);
	    
	    //peek()
	    System.out.println("Front element is:- "+p1.peek());
	    System.out.println("Poll method:- "+p1.poll());
	    
	   // p1.offer("Mango");
	    //System.out.println(p1);
	    
	    //will remove the first element
	    //p1.remove();
	    //System.out.println(p1);
	    
	    //poll - will remove front element
	   // p1.poll();
	   // System.out.println(p1);
	    
	    //element
	    //p1.element();
	    //System.out.println(p1);
	    

	}

}
