package ArrayClassBasic;

public class ArrayPracticclass13 {
	
	
	// JAVA PROGRAM REVERSE AN ARRAY...
	
public static void reverseArray(int arr[]) {
	
	for(int i=0; i<arr.length;i++) {
		System.out.print(arr[i] + " ");
	}
	System.out.println();
	for(int i=arr.length-1; i>=0;i--) {
		System.out.print(arr[i] + " " );
		
	}
}


	public static void main(String[] args) {
		
		int arr [] = {1,2,3,4,5,6};
		
		reverseArray(arr);

	}

}
