package ArrayClassBasic;

public class ArrayPractice4 {
	
	
	//GIVEN ARRAY ELEMENT FIND MAXIMUM VALUE  array index
	
	public static int maxOf(int arr[]) {
          	int maxIndex= 0;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>maxIndex) {
				
				maxIndex =i;
			}
		}
		
		return maxIndex;
	}

	public static void main(String[] args) {
	
            int arr [] = {1,5,77,9,3};
           
            int index = maxOf(arr);
            System.out.println("maximum element of array i " + index );  // arr[index] show maximum value;
		
		
	}
	                     // TIME COMPLEXITY IS 0(N) THETA  OF N
} 
