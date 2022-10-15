package ArrayClassBasic;

public class ArrayPractice9 {

//. Write a Java program to separate 0s on left side and 1s on right side of an array of 0s and 1s in random order.

	 public static void  segregateofArray(int arr[]) {
		 int  Indexj = 0;
		  
			for(int i =0; i<arr.length; i++) {
				
				if(arr[i]==0) {
					
					arr[Indexj++] = arr[i];  //this separate all zero [0,0,0,0]
					
				}
				
			}
			 while(Indexj<arr.length) {
				 arr[Indexj++] = 1;        // this clear is [0,0,0,0,1,1,1,1]
				 	
			 }
		 
		for(int k = 0; k<arr.length; k++) {
			 
			System.out.print(" " + arr[k] );
		}
	 }
	
	
	public static void main(String[] args) {
		
				     System.out.println(" after the Segregate array");
				      System.out.println();
				    
					 int arr [] = {0,1,0,1,0,1,0,1};
					  
					 segregateofArray(arr);
	        }

        }
