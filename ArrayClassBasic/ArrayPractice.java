package ArrayClassBasic;

public class ArrayPractice {
	
public static void main(String[] args) {     //check array found a  key element in given array....
		
		int [] arr = {1,5,4,78,8,75};
		int key = 8;
		
		
		int result=-1;
		
        for(int i=0; i<arr.length;i++) {
        	if(arr[i]==key) {
        		result=i;           //I = INDEX
        		break;
        	}
        	
        }
        if(result==-1) {
        	System.out.println("NOT FOUND ");
        }else {
        	System.out.println("FOUND " + result);
        }

	}
}


