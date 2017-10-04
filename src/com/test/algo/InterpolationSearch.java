package com.test.algo;

/**
 * This search mechanism is similar to binary search with a change that here it need
 * not necessarily search from the middle of the array elements like binary
 * but it finds a pos value which finds the position nearest to the element we are 
 * searching using the following formula
 * 
 * pos = lo + (((hi-lo) / (arr[hi]-arr[lo])) * (x-arr[l0]));
 * eg 
 * lo=0, hi=14 and x=18
 * pos = 0 + (((15-0) / (47-10)) * (18-10))
 * 	   = 0 + ((15/37) * (8))
 *     = 0 + (0.41 * 8)
 *     = 0 + 3.24
 *     = 3 
 *     
 * Here the complexity is o(loglogn) which is less than binary search 
 * however in worst case it can take complexity of o(n)
 * 
 * Again this works on sorted array
 * */
public class InterpolationSearch {
	public static void main(String[] args) {
		int []arr = new int[]{10, 12, 13, 16, 18, 19, 20, 21, 22, 23,
                24, 33, 35, 42, 47};
		int x=17;
		System.out.println(search(arr,x));
	}

	private static boolean search(int[] arr, int x) {
		int lo=0;
		int hi=arr.length-1;
		while(lo <= hi && x >= arr[lo] && x <= arr[hi]){
			int pos = lo + (((hi-lo) / (arr[hi]-arr[lo])) * (x-arr[lo]));
			
			if(arr[pos] == x){
				return true;
			}
			if(arr[pos]<x)
				lo=pos+1;
			else
				hi=pos-1;
			
		}
		return false;
	}
}
