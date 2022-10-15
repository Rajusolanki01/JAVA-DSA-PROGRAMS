package ArrayClassBasic;

public class Arraypracticclass15 {

	// find the leaders in array....  and if you want reverse this 
	
	public static void leadersArrays(int arr[]) {
		
		System.out.println(" finding leaders in array : ");
		
		int Leader = Integer.MIN_VALUE;
		//int b[]= new int [arr.length];
		//int j = 0;
		for(int i=arr.length-1;  i >=0; i--) {
			if(arr[i]>Leader) {
				Leader=arr[i];
				System.out.print(" " + arr[i]);
				//b[j++]=arr[i];
			}
		}
	           // time complexity is O(n).....
		
		
//		for(j=j-1;j>=0;j--) {
//			System.out.print(b[j] + " ");
//		}
	}
	
	

	public static void main(String[] args) {

		int arr[] = {2,7,6,5,1,4,3};
		leadersArrays(arr);
	}

}
