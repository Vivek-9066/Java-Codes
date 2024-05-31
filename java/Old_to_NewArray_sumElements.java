package com.java;

public class Old_to_NewArray_sumElements {

	public static void main(String[] args) {
		int[] inputArray = {1, 3, 6, 5};
        
        // Calculate the new array
        int[] resultArray = calculateSumArray(inputArray);
        
        // Print the result
        for (int i : resultArray) {
            System.out.print(i + " ");
        }

	}

	private static int[] calculateSumArray(int[] arr) {
		if(arr == null || arr.length < 2) {
			return new int[0];
		}
		
		int[] sumArray = new int[arr.length-1];
		
		for(int i=0;i<arr.length-1;i++) {
			sumArray[i] = arr[i] + arr[i+1];
		}
		return sumArray;
	}

}
