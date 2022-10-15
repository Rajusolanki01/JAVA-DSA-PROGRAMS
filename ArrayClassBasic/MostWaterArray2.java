package ArrayClassBasic;

public class MostWaterArray2 {
	// Given n non-negative integers representing an elevation map where the width of each bar is 1, 
//	compute how much water it can trap after raining.
	public static int trap(int arr[] ) {
        int result = 0;
        int l = 0;
        int r = arr.length - 1;
        while (l < r) {
            if (arr[l] < arr[r]) {
                int current = arr[l];
                while (arr[l++] < current) {
                    result += current - arr[l];
                }
            } else {
                int current = arr[r];
                while(arr[--r] < current) {
                    result += current - arr[r];
                }
            }
        }
        return result;
    }
	public static void main(String[] args) {
		int arr [] = {0,1,0,2,1,0,1,3,2,1,2,1};
		int ans = trap(arr);
		System.out.println(ans);
		 
	}

}
