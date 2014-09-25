package org.avg.ds.search;

import java.util.Arrays;


public class BinarySearch {

	
	//// Assumption :: Sorted Array
	
	
	public static int search(int[] inpArray, int searchValue){
		int startPos = 0;
		int endPos = inpArray.length-1;
		
		int midPos;
		
		while( endPos >= startPos){
			midPos = (startPos + endPos)/2;
					
			if(inpArray[midPos]==searchValue){
				System.out.println("Found and index is "+midPos);
				return midPos;
			}
			
			if( inpArray[midPos] > searchValue ){
				endPos = midPos-1;
			}else{
				startPos = midPos+1;
			}
		}
		return -1;
	}
	
	public static void main(String args[]){
		int[] inpArray = {2,4,3,5,8,9,12,56,34,100,1,7};
		Arrays.sort(inpArray);
		System.out.println(Arrays.toString(inpArray));
		int index = BinarySearch.search(inpArray, 34);
		System.out.println("Index:"+index);
		if(index!=-1){
			System.out.println("Found");
		}else{
			System.out.println("Not found");
		}
	}
}
