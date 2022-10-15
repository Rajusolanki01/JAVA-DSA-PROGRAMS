package ArrayClassBasic;

public class Arraypracticclass11 {    
	 
	
	// given array find smallest value
	
	public static int getSmallest(int arr[]) {
		int temp;
		for(int i = 0; i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
		}
		
		return arr[0];
	}

	public static void main(String[] args) {
		
		
		int arr [] = {11,8,51,4,2,5};
		
		System.out.println(" smallest element : " + getSmallest(arr));
	
	}

}
