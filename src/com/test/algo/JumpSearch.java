package com.test.algo;

/**
 * The algorithm is similar to binary search with the difference that we do not 
 * divide the elements into equal halfs but some index value which is usually
 * sqrt of the number of elements in the array
 * i.e. m= sqrt of n
 * Time complexity - o(sqrt(n))
 * 
 * It works only on sorted arrays
 * time complexity between linear search and binary search
 * Binary search if better than jump search, one adv of Jump search that we traverse
 * back only once. 
 * Consider we need to find an element which is the smallest element. In that case 
 * if we use binary search time complexity increases else jump search is the best
 * */
public class JumpSearch {
	public static void main(String[] args) {
		int []arr = { 0, 1, 1, 2, 3, 5, 8, 13, 21,
                34, 55, 89, 144, 233, 377, 610};
		int val=1;
		System.out.println(search(val,arr));
	}
	
	private static boolean search(int value, int []arr){
		int n= arr.length;
		int m = (int) Math.floor(Math.sqrt(n));
		int step =m;
		int prev=0;
		while(arr[Math.min(step, n)-1]<value){
			prev=step;
			step+=m;
			if(step >=n){
				return false;
			}
		}
		
		while(arr[prev]<value){
			prev++;
			if(prev == Math.min(step, n)){
				return false;
			}
		}
		if(arr[prev]==value){
			return true;
		}
		return false;
	}
}
