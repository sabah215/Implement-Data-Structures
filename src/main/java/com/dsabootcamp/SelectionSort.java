package com.dsabootcamp;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {1, 3 , 44, 23 , 9 , 18 , -32};
		
		int [] sorted = selectionSort(arr);
		
		for(int i=0;i < sorted.length;i++)
			System.out.print(sorted[i] + ", ");

	}
	
	static int [] selectionSort(int [] arr) {

		for (int i = 0; i < arr.length; i++) {
			
			// Calculate the value of last index
			int lastI = arr.length - i - 1;
			
			// Get the maximum index
			int maxI = getMaxIndex(arr, 0, lastI);
			
			// swap last element with maximum index element
			swap(arr, maxI, lastI);
		}
		return arr;
	}
	
	static int getMaxIndex(int[] arr, int start, int end) {
		int maxI = start;
		
		for (int i = start; i <= end; i++) {
			if(arr[maxI] < arr[i]) {
				maxI = i;
			}
		}
		return maxI;
	}
	
	static void swap(int [] arr, int maxIndex, int last) {
		int temp = arr[last];
		arr[last] = arr[maxIndex];
		arr[maxIndex] = temp;
	}
}
