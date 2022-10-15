package ArrayClassBasic;

public class Sub3Array {
	
	// maximum sum Subarray.....
	
	public static int largestSumSubArray(int arr[]) {
		
		int curSum = 0;
		int maxSum = Integer.MIN_VALUE;
		for(int num : arr) {
			curSum = curSum + num;
			if(maxSum < curSum) maxSum = curSum;
			if(curSum<0) curSum=0;
			
		}
		
		return maxSum;
		
	}
	
	public static void main(String[] args) {
		
          int arr[] =  {6,-7,4,-2,1,5,-4};
          int ans =  largestSumSubArray(arr);
          System.out.println(ans);
         
	}

}
