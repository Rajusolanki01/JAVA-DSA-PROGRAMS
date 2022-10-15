package JavaBasicPracticProbelms;

import java.util.Scanner;

public class JavaPractice5 {
	
	public static void main(String [] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the element");
		 int num= sc.nextInt();
		 int numcopy=num;
		 int nod=0;
		 int digit=0;
		while(numcopy>0) {
			
			nod++;
			numcopy/= 10;
		}
	       numcopy=num;
	       System.out.println("The Digits Of " + num + " are:-");
	       while(numcopy>0) {
	   		digit = numcopy/(int)Math.pow(10, nod-1);
	   		System.out.print(digit + ",");
	   		numcopy = numcopy % (int)Math.pow(10, nod-1);
	   		nod--;
	   	}
	}

}
