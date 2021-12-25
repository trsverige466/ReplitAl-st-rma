package arrays;

import java.util.Arrays;

public class Q6 {

	public static void main(String[] args) {
		

	/*	Write a method that accepts an integer array as input and prints the minimum and the maximum numbers from given array

		Input : {3,2,5,4,1,6}

		Output :

		min: 1

		max: 6*/
		
		int intup[]=  {3,2,5,4,1,6};
		
		Arrays.sort(intup);
		
		System.out.println("min: " + intup[0]);
		
		System.out.println("max: " + (intup.length));
	}

}
