package com.test.algo;

import java.util.Arrays;

/**
 * With a time complexity of o(logn) exponential search go through the list of arr
 * elements to find the block which is closest to the value to b searched
 * as the name suggest it exponentially proceeds
 * so for i starting from 1 it goes on and iterates over multiplying by 2 until the
 * closer value is found
 * then it performs binary search on the block found to get the index position of 
 * the element
 * 
 * it works fine for unbounded series of elements where size of array is infinite
 * also if the value to be searched is in the start of array
 * */
public class ExponentialSearch {
	public static void main(String[] args) {
		int arr[] = {2, 3, 4, 10, 40};
        int x = 10;
        System.out.println(search(arr,x));
	}

	private static boolean search(int[] arr, int x) {
		int n= arr.length;
		if(arr[0]==x){
			return true;
		}
		int i=1;
		while(i<n && arr[i]<=x){
			i=i*2;
		}
		int val=Arrays.binarySearch(arr, i/2,Math.min(i, n),x);
		return val>0?true:false;
	}
}
