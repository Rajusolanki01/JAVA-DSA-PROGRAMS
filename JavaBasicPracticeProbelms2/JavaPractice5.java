package JavaBasicPracticeProbelms2;

public class JavaPractice5 {

	public static void main(String[] args) {
		 // Java Program to Display ODD Numbers From 1 to 100
		
		int number=100;  
		System.out.print("List of even numbers from 1 to "+number+": ");  
		for (int i=1; i<=number; i++)   
		{  
		//logic to check if the number is even or not  
		//if i%2 is NOT equal to zero, the number is even  
		if (i%2!=0){  
		System.out.print(i + " ");
		
		}  
	  }  
	}

}
