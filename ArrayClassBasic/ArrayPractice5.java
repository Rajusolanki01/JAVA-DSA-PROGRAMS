package ArrayClassBasic;

import java.util.Arrays;

public class ArrayPractice5 {            
	
	// SECOND LARGEST OF AN ELEMENT GIVEN ARRAY ....
	
	//public static int secondLargest(int a[]){
		public static void secondLargest(int a[]){
		
//		if(a.length<2) return -1;
//		
//		int Largest = 0;
//		int secondLargest = -1;
//		
//		for(int i = 1; i < a.length; i++) {
//			if(a[i] > a [Largest]) {
//				secondLargest = Largest;
//				Largest = i;
//				
//			}else if(a[i] < a [Largest]) {    
//				
//	// AGAR SECOND LARGEST DEFINE NHI HOTA AGR -1 HI RHETA TB HAME 
//	// SECONDLARGEST = -1;  IF(secondLarges == -1 || ) in below if condition			
//				if(secondLargest == -1 || a[i] > a [secondLargest]) {
//					secondLargest = i;
//				}
//			}
//		}
//		
//		return secondLargest;
		
		// OPTIMIZE WAY TO CODE THIS .... 
		
		int size = a.length; 
		if(size<2) {
			System.out.println("INVALID");
			return ;
		}
		
		Arrays.sort(a);
		System.out.println("SEOND LARGEST ELEMENT " + a[size-2]);    // ONLY FOR SECOND LARGEST KE LIYE...
		
//		for(int i= size-2; i >= 0; i--) {     //  THIS IS FOR SAME DOUBLE LARGEST VALUE ME SECOND LARGEST KE LIYE....
//			if(a[i]!=a[size-1]) {
//				System.out.println("THE SECOND LARGEST ELEMENT IS " + a[i]);
//				return ;
//			}
//		}
		
		
		
	}

	public static void main(String[] args) {
              		 		
	       int a [] = {1,11,46,55,66,66};
	       
//	       int Index = secondLargest(a);
//	       System.out.println(a[Index]);
	    		   
	       secondLargest(a);

	}

}
