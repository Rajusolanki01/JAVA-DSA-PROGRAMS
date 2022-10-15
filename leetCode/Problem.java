package leetCode;

public class Problem {
	//  Two Sum integer
	
	public static int[] twoSum(int[] nums, int target) {
		
		int[] sum = new int[2];
	    for (int i = 0; i < nums.length; ++i) {
	        for (int j = i + 1; j < nums.length; ++j) {
	            if (target == nums[i] + nums[j]) {
	                sum[0] = i;
	                sum[1] = j;
	                return sum;
	                
	            }
	        }   // System.out.println(sum);
	    }
	    return sum;

}
	public static void main(String[] args) {
		
    int[] arr = {-1,-2,-3,-4,-5};
    int target = -8;

//		output will (0,1)
  for(int x : twoSum(arr,target))
		  System.out.print( x + " ");
           System.out.println();
          System.out.println("target: "+ target);
    
	}
}
           // ANOTHER APPROCH ..... WITH INPUT BY USER

//public static int[] twoSum(int[] nums, int target) {
//	
//	int left = 0; int right = nums.length-1, tempsum;
//	
//	while(left<right) {
//		tempsum = nums[left] + nums[right];
//		
//		if(tempsum==target) { 
//			return new int [] {left  , right };  // {left+1  , right+1 }; step==2 using	q1
//			
//		}	
//		if(tempsum>target) {
//			right --;
//			
//		}else {
//			
//			left++;
//		}
//	}
//	
//	return new int[] {left  , right + 1 };  // { -1,-1}; == step 2 using
//}
//
//
//public static void main ( String [] args) {
//	
//	int [] nums = {-1,-2,-3,-4,-5};  //output = 0,1
//	//int [] nums = {1,4,5,11,12};  // step==2
//	int target = -8;
//	 
//	for(int e : twoSum(nums,target))
//		System.out.print(e + " ");
//}
//
//}
