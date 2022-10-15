package ArrayClassBasic;

public class ArrayMatrix2 {
	
	// PRIT SQUARE MATRIX ROTATE A 90' CLOCKWISE...	
	
	
	static void rotateMatrix(int arr[][]) {
		int n = arr.length;
		transfoseOfMAtrix(arr);
		for(int i=0;i<n;i++) {
			for(int j=0;j<n/2;j++) {   //n/2 BECOUSE RUN ONLU HALF MATRIX
				int swap = arr[i][j];
				arr[i][j]= arr[i][n-j-1]; // N-J-1  ARR.LENGTH-COL-1 ;
				arr[i][n-j-1] = swap;
			}
		}
		
	}
	static void printMatrix(int arr[][]) {
		int n = arr.length;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(arr[i][j] + " ");
			}
			
			System.out.println();
		}
	}
	
	static void transfoseOfMAtrix(int arr[][]) {
		
		int n = arr.length;
		for(int i = 0;i<n;i++) {
		for(int j=i;j<n;j++) {
			int swap  = arr[i][j];
			arr[i][j] = arr[j][i];
			arr[j][i] = swap;
			
		}
			
			System.out.println();
		}
			
	}

	public static void main(String[] args) {
       int arr [][] = {
				
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}
		                };
       
       printMatrix(arr);
       //transfoseOfMAtrix(arr);
       rotateMatrix(arr);
       printMatrix(arr);
     

	}

}
