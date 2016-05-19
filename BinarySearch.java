package com.algo.interviewbook;

public class BinarySearch {
	public static int binarysearch(int []input, int item){
		int high = input.length-1;
		int low = 0;
		int mid;
		while(low<=high){
			mid = (low+high)/2;
			if(item<input[mid]){
				high = mid-1;
			}else if(item>input[mid]){
				low = mid+1;
			}else{
				//match found.
				return mid;
			}
		}
		return -1;//ERROR.
	}
	public static void printArray(int[] array){
		for(int i:array){
			System.out.print(i+" ");
		}
		System.out.println();
	}
	public static void main(String []args){
		int []input = {1, 2, 3, 5, 7, 8, 9};
		int ele = 9;
		BinarySearch.printArray(input);
		System.out.println("index : "+BinarySearch.binarysearch(input, ele));
		
	}

}
