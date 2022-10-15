package ArrayClassBasic;

import java.util.Arrays;

public class ArrayPracticclass16 {
	
	
	// Kth Largest Element in an Array
//	Input: nums = [3,2,1,5,6,4], k = 2
//			Output: 5
	
	public static int findKthLargest(int[] arr) {
		
		int k=2;
        Arrays.sort(arr);
         return arr[arr.length-k]; 
       
	}



	public static void main(String[] args) {
		 int arr[]  = {3,2,1,5,6,4};
		 System.out.println(findKthLargest(arr));
	
	}

}
