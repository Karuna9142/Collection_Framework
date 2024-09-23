package com.array;
import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionalArrayEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		int arr2D[][] = {{1,2,3}, //0the index
//				        {4,5},   //1st index
//				        {6,7,8,9}}; //2nd index
		
		int arr[][] = new int[3][2];
		System.out.println(arr.length);  //no.of rows
		
		//input
		for(int row = 0; row<arr.length; row++)
		{
			for(int col = 0; col<arr[row].length; col++)
			{
				arr[row][col] = sc.nextInt();
			}
		}
		for(int row = 0; row<arr.length; row++)
		{
			for(int col = 0; col<arr[row].length; col++)
			{
				System.out.println(arr[row][col]+ " ");
				//System.out.println(Arrays.toString(arr[row]));
			}
		}
	}

}
