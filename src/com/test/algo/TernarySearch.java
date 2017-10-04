package com.test.algo;

/**
 * Ternary search similar to binary search just that the comparison elements 
 * here are defined using a specific formula such that 
 * mid1 = l + (r-l)/3;
 * mid2 = mid1 + (r-l)/3;
 * 
 * the complexity here is logn to the base 3
 * for binary its log n to the base 2
 * upon comparison it shows that it has more comparison compared to binary
 * Time Complexity for Binary search = 2clog2n + O(1)
 * Time Complexity for Ternary search = 4clog3n + O(1)
 * 
 * */
public class TernarySearch {
	public static void main(String[] args) {
		int []arr = new int[]{10, 12, 13, 16, 18, 19, 20, 21, 22, 23,
                24, 33, 35, 42, 47};
		int x=18;
		System.out.println(search(arr,0,arr.length-1,x));
	}

	private static boolean search(int[] arr, int l, int r,int x) {
		if(r>=l){
			int mid1=l+(r-l)/3;
			int mid2=mid1 + (r-l)/3;
			
			if(arr[mid1]==x)
				return true;
			
			if(arr[mid2]==x)
				return true;
			
			if(arr[mid1]>x)
				return search(arr,l,mid1-1,x);
			
			if(arr[mid2]<x)
				return search(arr,mid2+1,r,x);
			
			return search(arr,mid1+1,mid2-1,x);
		}
		return false;
	}
}
