package JavaBasicPracticProbelms;

public class JavaPractice1 {

	
	//PRINT FIBONACCI SERIES  0,1,1,2,3,5
		
		public static void Fibonacci(int n) {
			
			int num1=0 ,num2=1;
			int counter = 0;
			 while(counter<n) {
				 System.out.print(num1 + " ");
				 
				 int num3 = num2+num1;
				 num1=num2;
				 num2=num3;
				 
				 counter++;
				 
			 }
			
		}

		public static void main(String[] args) {
			
			int n=10;
			
			Fibonacci(n);

		}

	}
