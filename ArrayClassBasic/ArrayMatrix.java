package ArrayClassBasic;

public class ArrayMatrix {
	
	// Transpose the square matrix....
	
	
	static void printMatrix(int arr[][]) {
		int n = arr.length;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(arr[i][j] + " ");
			}
			
			System.out.println();
		}
	}
		static void transposeMatrix(int arr[][]) {
			
			int n = arr.length;
			for(int i =0; i<n;i++) {
				for(int j=i;j<n;j++) {
					int swap = arr[i][j];
					arr[i][j] = arr[j][i];
					arr[j][i] = swap;
				}
			}
			System.out.println(" ");
		}
	public static void main(String[] args) {
		int arr [][] = {
				
				{1,2,3},
				{4,5,6},
				{7,8,9}
		                };
		printMatrix(arr);	
		transposeMatrix(arr);
		printMatrix(arr);
		
		

	}

}
