package com.array;

public class JaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Jagged array
//		{0,1,2}
//		{3,4},
//		{5,6,7,8}
		
		
		
		
		
		int arr[][] = new int[3][];
		arr[0] = new int[3];
		arr[1] = new int[2];
		arr[2] = new int[4];
		
		int count = 0;
		for(int i = 0; i<arr.length; i++)
		{
			for(int j = 0; j<arr[i].length; j++)
			{
				arr[i][j] = count++;
			}
		}
		
		for(int i = 0; i<arr.length; i++)
		{
			for(int j = 0; j<arr[i].length; j++)
			{
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}

	}

}
