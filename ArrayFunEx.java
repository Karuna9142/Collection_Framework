package com.array;

public class ArrayFunEx 
{
 static void min(int arr[])
 {
   int min = arr[0];
   for(int i = 1; i<arr.length; i++)
   {
	   if(min>arr[i])
	   {
		   min = arr[i];
	   }
   }
   System.out.println(min);
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,4,5,8,9,1};
		
		min(arr);
		

	}

}
