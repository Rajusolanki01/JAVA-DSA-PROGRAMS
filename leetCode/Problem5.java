package leetCode;

import java.util.PriorityQueue;

public class Problem5 {
	
// Kth Smallest Element in a Sorted Matrix
//	Input: matrix = [[1,5,9],[10,11,13],[12,13,15]], k = 8
//	Output: 13
//	Explanation: The elements in the matrix are [1,5,9,10,11,12,13,13,15], and the 8th smallest number is 13

	  public static int kthSmallest(int[][] matrix, int k) {
	         if (matrix == null || k <= 0) {
	            throw new IllegalArgumentException("Input is invalid");
	        }

	        int n = matrix.length;
	        if (k > n * n) {

	        }
	        if (k == 1) {
	            return matrix[0][0];
	        }
	        if (k == n * n) {
	            return matrix[n - 1][n - 1];
	        }

	        PriorityQueue<int[]> queue = new PriorityQueue<>((a, b) -> (matrix[a[0]][a[1]] - matrix[b[0]][b[1]]));

	        for (int i = 0; i < Math.min(n, k); i++) {
	            queue.offer(new int[] { i, 0 });
	        }
	        while (k > 1) {
	            int[] cur = queue.poll();
	            if (cur[1] < n - 1) {
	                cur[1]++;
	                queue.offer(cur);
	            }
	            k--;
	        }

	        return matrix[queue.peek()[0]][queue.peek()[1]];
	        
	    }
	

   public static void main(String []args) {
	   
	   int arr[][]= {{1,5,9},{10,11,13},{12,13,15}};
				   
	  int key = 8;
	  
			  kthSmallest(arr,key);
	   
	
  }
}
