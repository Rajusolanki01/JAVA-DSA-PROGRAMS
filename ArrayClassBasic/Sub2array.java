package ArrayClassBasic;

public class Sub2array {
	
	// sum of all subarrays ..
	
	public static long  subArrays(int arr[], int n) {
		
		int result = 0 , sum=0;
		//pick starting point,,,
		for(int i=0;i<n;i++) {
			sum=0;
			for(int j=i;j<n;j++) {
				
				// sum subarray between current..
				// starting to ending point...
			sum+=arr[j];
			result+=sum;
				
			}
			
		}
		return result;
		
	}

	public static void main(String[] args) {
		
		int arr[] = {1,2,3};
		int n =arr.length;
		System.out.println(" sum of subarrys " + subArrays(arr,n) );


	}

}
