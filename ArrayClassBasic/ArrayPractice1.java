package ArrayClassBasic;

public class ArrayPractice1 {

	public static int delete(int arr[],int key) {
	
		//	DELETE AN element GiVEn ARRAY 
		
		
		int i=0;
		int n=arr.length;
		for(;i<n;i++) {         //THIS LOOOP WORK FOR FIND THE ELEMENT 
			if(arr[i]==key) {
				break;	
			}
		}
		
		if(i==n) return n;
		for(int j=i;j<n-1;j++) {
			arr[j]=arr[j+1];        //ELEMENT SHIFTING
			
		}
		
		
		return n-1;
	}
	
	
	public static void main(String [] args) {
		
		
		int [] arr = {1,5,7,2,9,10};
		int key = 5;
		
		delete(arr,key);
		
		for(int e:arr) {
			
			System.out.print(e + " ");
		}
		
		
	   }
	}