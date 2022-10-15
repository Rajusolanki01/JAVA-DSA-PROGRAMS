package ArrayClassBasic;

public class SubArray {

	public static void main(String[] args) {
		
		// write an array program to find subarray equal is key =3;
		
		int arr[] = {1,2,3};
		int k=3;
		int n = arr.length;
		
		
		int result = 0;
		
		for(int i=0;i<n;i++) {
			
			int sum=0;
			for(int j=i;j<n;j++) {
				sum= sum+arr[j];
				if(sum==k) {
					
					result++;
					
				}
			}
			
		}
		
		System.out.println("Number of subarray that sum upto : " + k +  " is " + result);
	}

}
