package leetCode;

public class Problem4 {
	//TRANSPOSE THE MATRIX...
	public static int[][] transpose(int [][] matrix ) {
		int row = matrix.length;
		int col = matrix[0].length;  //where its 0th row or any row columns will be same so thats we always consider 0th row columns length
		int[][] arr = new int[col][row];
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				arr[j][i] = matrix[i][j];
			}
		}
		return arr;
	    }
	    
	
	
	public static void main(String[] args) {
	
	}
}
