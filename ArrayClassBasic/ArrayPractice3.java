package ArrayClassBasic;
                                              
public class ArrayPractice3 {  
	
	
	  //LARGEST ELEMENT OF AN ARRAY....
	
	public static void maxOf(int arr[]) {
		int max = Integer.MIN_VALUE;
        for(int i =0; i<arr.length; i++) {
       	 if(arr[i]>max) {
       		 max=arr[i];
       	 }
       		
        }
        
        System.out.print("maximum element is " + max);
        
	}

	public static void main(String[] args) {
	
             int arr [] = {1,2,55,4,7,8};
             
             maxOf(arr);  
             
           
             }
	}

// TIME COMPLEXITY IS 0(N) THETA  OF N
