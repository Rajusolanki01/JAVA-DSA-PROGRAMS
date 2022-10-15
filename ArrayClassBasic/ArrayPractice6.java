package ArrayClassBasic;

public class ArrayPractice6 {

	           //PROGRAM GIVEN ARRAY FIND MAX AND MIN VALUE

	public static void maxOf(int arr[]) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
        for(int i =0; i<arr.length; i++) {
       	 if(arr[i]>max) {
       		 max=arr[i];
       	 }
       	 
       	 if(arr[i]<min) {
       		 min=arr[i];
       	 }
       		
        }
        
        System.out.println("maximum element is " + max);
        System.out.println("minimum element is " + min);
       
		
	}

	public static void main(String[] args) {
	
             int arr [] = {1,2,55,4,7,8};
             
             maxOf(arr);   
	}

}



