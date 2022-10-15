package ArrayClassBasic;

public class ArrayMatrix3 {
	
	// Search element in row-wise and column-wise in sorted matrix
	
	static boolean SearchInMatrix(int arr[][],int key) {
		int row = 0;
		int col = arr.length-1;
		while(row<arr.length && col >= 0) { //last se starting  ride ke liye i<arr.len starting is bottom tk
			if(arr[row][col]==key){
				return true;
			}else if(key>arr[row][col]) {
				row++;
				
			}else {
				col--;
			}
		}
		return false;	
	}

	public static void main(String[] args) {
		
        int arr [][] = {{1,4,5,7},
        		        {2,5,6,9},
        		        {6,10,11,13},
        		        {8,12,15,18}};
        int key = 10;
        
        System.out.println(SearchInMatrix(arr,key));
        
	}

}
