package ArrayClassBasic;

public class Arraypractice2 {
	
	// REMOVE DUPLICATES FROM  A SORTED ARRAY ....
	
public static int removeDuplicateElements(int arr[],int n) {
		
		if(n==0 || n==1) {
			return n;         //AGAR ELEMENT PRESENT NA HO MEMORY MAI....
			
		}
		
		
		int [] temp = new int [n];
		int j=0;
		
		for(int i = 0; i<n-1;i++)	{
			if(arr[i]!=arr[i+1]) {
				temp [j++] = arr[i];
				
			}
		}
		
		temp[j++] = arr[n-1];
		
			// CHANGING ORIGNAL ARRAY....
		
		for(int i=0; i<j;i++) {
			arr[i] = temp[i];
		}
		
		return j;	
		
	}
	
public static void main(String [] args) {
	
	  int [] arr = {1,5,5,2,3,3,4,4,4};
	
	  int length = arr.length;
	  length = removeDuplicateElements(arr,length);
		
       // PRINT ARRAY ELEMENTS....

       for(int i=0;i<length;i++) {
    	   
    	   System.out.print(arr[i] + " ");
    	   
       }
    }
}
