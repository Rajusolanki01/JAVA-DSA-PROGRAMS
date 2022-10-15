package ArrayClassBasic;

public class MostWaterArray {
	
	
	// CONTAINER WITH MOST WATER
	static int containerWithMostWater(int arr[]) {
		int maxArea = 0;
		int l = 0;
		int r = arr.length-1; 
		
		while(l<r) {
			 
			int height = Math.min(arr[l], arr[r]);
			int distance = r-l;
			
			int area = height*distance;
			maxArea = Math.max(maxArea, area);
			   if(arr[l]<arr[r]) {
	        	   l++;
	           }else {
	        	   r--;
		}
			   
	   }
		
		return maxArea;
	}

	public static void main(String[] args) {
		
		int arr [] = {1,4,6,2,4,5,8,3,7};
		 int ans = containerWithMostWater(arr);
		System.out.println(ans);

	}

}
