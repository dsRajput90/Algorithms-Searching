package com.test.algo;

/**
 * This algorithm divides the array into two halves and recursively checks the 
 * appearance of value in the remaining half and further divides it.
 * Time complexity is O(logn)
 * */
public class BinarySearch {
	public static void main(String[] args) {
		int []arr = {2, 3, 4, 10, 40};
		int val=12;
		System.out.println(search(val,arr,0,arr.length-1));
	}

	private static boolean search(int val, int[] arr, int l,int r) {
		if(l==r){
			if(val == arr[r]){
				return true;
			}
			return false;
		}
		if(r>=1){
			int m = (l+r)/2;
			if(val == arr[m]){
				return true;
			}else if(val>arr[m]){
				return search(val,arr,m+1,r);
			}else {
				return search(val,arr,0,m-1);
			}
		}
		return false;
		
	}
}
