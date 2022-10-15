package ArrayClassBasic;

public class ArrayPractice7 {

	public static void main(String[] args) {
		
		
		//write a java program to find the number greater then the average of the number of a given array
	
		int arr[] =  {1,5,44,7,58,64,4};
		int n = arr.length;
		int sum = 0;
		for(int i = 0; i<n; i++) {
			sum += arr[i];
			
		}
		
		double average = sum /n;
		System.out.println(" array average is : " + average);
		for(int i =0; i<n; i++) {
			if(arr[i]>average) {
				System.out.println(" array greater is : " +arr[i]);
			}
	}
		
		
	}
}