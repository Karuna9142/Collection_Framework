package com.genreex;

public class GenericEx {
	
	public static<E> void printArray(E[] elements)
	{
		for(E e:elements)
		{
			System.out.println(e);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Character[]ch = {'a','b','c','d','e'};
		
		String []name = {"Kriti","Karuna","Komal","Simran"};
		
		System.out.println("Printing character:- ");
		printArray(ch);
		
		System.out.println("Printing String:- ");
		printArray(name);

	}

}
