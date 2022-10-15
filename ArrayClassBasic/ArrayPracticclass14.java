package ArrayClassBasic;

public class ArrayPracticclass14 {
	
	// program left rotate the element of an array

	public static void main(String[] args) {
	 
		
		
		int arr [] = new int [] {1,2,3,4,5};
		
		int n= 2 ;  // N DETERMINE TO NUMBER OF ARRAY SOULD ROTATE..
		
		System.out.println("Orignal array");
		
		for(int i=0;i<arr.length;i++) {       //this loop is print only original array form
			System.out.print(arr[i] + " ");
		}
		
		for(int i=0;i<n;i++) {
			int j,first;
			
			first=arr[0];   // store the element of the array
			
			for(j=0;j<arr.length-1;j++) {
				
				arr[j]=arr[j+1];   //shifted element of by one..
					
			}
			
			arr[j]=first;
			
		}
		
		System.out.println("");
		System.out.println("After Rotate Array");
			
			for(int e : arr) {  //this is provide new rotate array 
				
				System.out.print(e + " ");
				
			}
		}

	}


