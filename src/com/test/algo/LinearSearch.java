package com.test.algo;

/**
 * Basic searching algorithm which iterates over the list of elements to find the
 * element.
 * So it has a worst case complexity of O(n)
 * 
 * */
public class LinearSearch {
	public static void main(String[] args) {
		int []arr = {1,2,5,9,4,6};
		int val=5;
		System.out.println(search(val,arr));
	}
	
	private static boolean search(int value, int []arr){
		for(int i=0;i<arr.length;i++){
			if(arr[i]==value){
				return true;
			}
		}
		return false;
	}
}