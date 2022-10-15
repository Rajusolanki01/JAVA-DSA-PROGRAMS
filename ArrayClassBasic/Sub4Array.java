package ArrayClassBasic;

public class Sub4Array {
	
	// minimum sum subarray problem..
	
public static int minimumSumSubArray(int arr[]) {
	
	int minSum =Integer.MAX_VALUE;
	
	int curSum = 0;
	
	for(int num : arr) {
		
		curSum+=num;
		minSum = Math.min(minSum, curSum);
		curSum = Math.min(curSum,0);
		
	}
	
	return minSum;      //time complexity is O(n)...
}

	public static void main(String[] args) {
		
		//int arr [] = {3,-4,2,-3,-1,7,-5};
	     int arr[] =  {6,-7,4,-2,1,5,-4};
	     //int arr [] = {1,4,4};
		
		int ans = minimumSumSubArray(arr);
		
		System.out.println(ans);

	}

}
