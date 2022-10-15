package ArrayClassBasic;

public class Arraypracticclass12 {
	
	// FIND THE THIRD LARGEST ELEMENT IN GIVEN ARRAY....
	
	
	public static int thirdLargest(int arr[],int n) {
		
			int n1 =arr.length;
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
			
			return arr[arr.length-4];
	}

	public static void main(String[] args) {
		
		
		int arr [] = {58,45,78,85,90};
		
		System.out.println(" third largest element : " + thirdLargest(arr,arr.length));
	
	}

}