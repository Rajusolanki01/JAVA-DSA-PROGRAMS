package javaBasics;

import java.util.Scanner;

public class JavaPracticeProblms {

	//private static final double radius = 7.5;
	
	public static void main(String[] args) {
		
		//java program input two number and display product two number;
//		
//	
          Scanner sc = new Scanner(System.in);
//          
//          System.out.println("Input First Number");
//          int FirstNumber = sc.nextInt();
//          
//          System.out.println("Input Second Number");
//          int SecondNumber = sc.nextInt();
//          
//          System.out.println("Product of Two Numbers "+ FirstNumber + " x " + SecondNumber + " = " + FirstNumber * SecondNumber);
    
          // write a java program find tyhe area of perimeter of a circle there is two ways below down 
          
//		double Parimeter =  2 * Math.PI * radius;
//		double area =  Math.PI * radius *radius;
//		
//		System.out.println("Perimeter is = " + Parimeter);
//		System.out.println("area is = " + area);
//		 
//		System.out.println("Input the radius of  circle = ");
//		double radius = sc.nextDouble();
//		System.out.println(" Perimter is = " + (2* Math.PI * radius));
//		System.out.println(" ares is = " + (Math.PI * radius * radius));
		
          
          
          //write a program user input three numbers and display the greatest number
		System.out.println("Input  User1 numbers ");
          
		int User1 = sc.nextInt();
		
		System.out.println("Input User2 Number");
		int User2 = sc.nextInt();
		 
		System.out.println("Input User3 Number");
		int User3 = sc.nextInt();
		
		if(User1>User2 && User1>User3) {
			System.out.println("Greatest user 1 " + User1);
		}else if(User2>User1 && User2>User3) {
			System.out.println("Greatest user 2 "  + User2);
			
		}else if (User3>User1 && User3>User2) {
			System.out.println("Greatest user 3 =1 " + User3);
			
		}else {
			System.out.println("INVALID");
		}
//		
//          int number = 20 , second = 30;
//          System.out.println(" Before swap Number");
//          System.out.println(" first Number = " + number );
//          System.out.println(" Second Number = " +  second );
//		 
//          int temp = number;
//          number = second;
//          second = temp;
//          
//           System.out.println(" After the Swap ");
//           System.out.println(" first number = " + number);
//           System.out.println(" second Number = " + second);\
//          
//          System.out.println(" Enter The Grade VALUES");
//          int marks = sc.nextInt();
//          
//          char name = Raju;
//          char name = sunil;
//          char Name = san;
//          
//          if(marks>90) {
//        	  System.out.println("Raju Grade " + marks);
//        	  System.out.println(" sunil Grade" + marks);
//        	  System.out.println(" san Grade" + marks);
//        	  System.out.println("your Grade is A+ " );
//          }
//          
           
	}

}
