package org.avg.ds.sorting;

import java.util.Arrays;

public class BubbleSort {

	/******************************************************************************
	 * 
	 * Efficiency : 
	 * 	For each pass, it runs for n-1 times...
	 * 	so, the number of iterations: (n-1) + (n-2) + (n-3) + ... +1 = n(n-1)/2 ~O(n2)
	 * 
	 * 
	 * 
	 *******************************************************************************/
	
	
	public static void main(String args[]){
		
//		int[] inpArray = {51, 85, 34, 1, 31, 93, 15, 75, 39, 27};
		int[] inpArray = {51, 85, 34,1,31,93};
		
		System.out.println(Arrays.toString(inpArray));
		
		BubbleSort.sort(inpArray);
		
		System.out.println(Arrays.toString(inpArray));

	}
	
	public static void sort2(int[] inp){
		int left = 0;
		int right = inp.length -1;
		
		bubbleSort(left, right, inp);
		
	}
	
	private static void bubbleSort(int left, int right, int[] inp){
		int counter = 0;
		for(int i= inp.length-1 ; i>1; i--){
			for(int j=0; j<i; j++){
				counter++;
				if(inp[j] < inp[i]){
					int temp = inp[j];
					inp[j] = inp[i];
					inp[i] = temp;
				}
			}
		}
		System.out.println("Counter="+counter);
	}
	
	
	public static void sort(int[] inp){
		int counter = 0;
		int length = inp.length;
		for(int i=2; i<=length-1; i++){
			for(int j=0;j<i;j++){
				counter++;
				if( inp[j] < inp[i]){
					int temp = inp[j];
					inp[j] = inp[i];
					inp[i] = temp;
				}
			}
		}
		System.out.println("Counter="+counter);
	}
	
	
}
