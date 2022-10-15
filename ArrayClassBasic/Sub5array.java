package ArrayClassBasic;

import java.util.HashSet;
import java.util.Set;

public class Sub5array {
	
	// FIND IF THERE IS A SUBARRAY WITH SUM = 0 ;
	
		static boolean subArrayWithZeroSum(int [] arr) {
			
			int n = arr.length;
			 
		// using set integer..
			
			Set<Integer>set = new HashSet<>();
			int sum = 0;
			for(int i=0;i<n;i++) {
				sum+=arr[i];
				if(set.contains(sum)) {
					return true;
					
				}
				
				set.add(sum);
				
			}
			
			return false;
			
		}
		
		public static void main(String[] args) {
			
	           int arr [] = {2,3,1,-4,4,-2};
	           System.out.println(subArrayWithZeroSum(arr));
			
		}

	}
