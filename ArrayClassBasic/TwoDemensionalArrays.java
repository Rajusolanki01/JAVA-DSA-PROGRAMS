package ArrayClassBasic;

public class TwoDemensionalArrays {

	public static void main(String[] args) {
		
		//this is 2d array
		
		int[][] arr1 = new int [10][20];
		arr1[0][0] = 5;
		System.out.println("arr[0][0] = " + arr1[0][0]);
		System.out.println(" ");
		
		
		// This is 2D array declaration method
		
         int[][] arr2 = {{1,2} ,{3,4}
         
         };
         
		for(int i = 0; i<2; i++) {
			for(int j = 0; j<2; j++) {
				System.out.print("arr[" + i + "] [" + j + "] " + arr2 [i] [j]);
				System.out.println(" ");
				System.out.println();
			}
		}
		
		// This is 3D array declaration method
		
		int [][][] arr3 = {{{1,2} ,{3,4}},{{5,6},{7,8}}
		
		};
		
		for(int i = 0; i<2; i++) {
			for(int j = 0; j<2; j++) {
				for(int z = 0; z<2; z++) {
					System.out.print(arr3[i][j][z] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
		
		
		
	}

}
