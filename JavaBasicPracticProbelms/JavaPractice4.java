package JavaBasicPracticProbelms;

import java.util.Scanner;

public class JavaPractice4 {

           //adding two number WITH HELP OF function

	public static void myMethod(int sum) {
		System.out.println("adding : " +sum);
		
	}
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter th elment");
		int n1=sc.nextInt();
		System.out.println("Enter the second element");
		int n2 =sc.nextInt();
		myMethod(n1+n2);
			

}
}
