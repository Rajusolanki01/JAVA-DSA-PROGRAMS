package javaBasics;

import java.util.Scanner;

public class Conditionals {

	public static void main(String[] args) {
		
//		System.out.println("voting started"); // this is java  if else if statement
//		
//		int age = 25;
//		
//		if(age>=18) {
//			System.out.println("you can vote");
//		}else
//			System.out.println("not verified");
//		
//		System.out.println("voting ended");

		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter your value");
		
		int marks = sc.nextInt();
		
		
		if(marks>95) {
			
		System.out.println("your Grade A+");	
			
		}else if(marks>80) {
			System.out.println("Grade A");
			
		}else if(marks>70) {
			System.out.println("Grade B");
			
		}else if(marks>40) {
			System.out.println("Grade c");
			
		}else {
			System.out.println("FAIL");
		}

//	       int a = 55;
//	       int b = 30;
//	       int c = 35;
//	       
//	       if(a>b) {
//	    	               //this is nesting if under if block
//	    	   if(a>c) {
//	    		   System.out.println("A");
//	    	   }else {
//	    		   System.out.println("c");
//	    	   }
//	       }else {
//	    	   if(b>c) {
//	    		   System.out.println("B");
//	    	   }else {
//	    		   System.out.println("c");
//	    	   }
//	       }
		          //this started java switch statement  
		
//	            int number = 15;
//	           
//	            switch(number) {
//	            
//	            case 15:
//	            System.out.println("its a medium number ");
//	            break;
//	            
//	            case 20:
//	            System.out.println("its a extra medium number ");
//	            break;
//	            
//	            case 22:
//	            System.out.println("its appo0x value meter ");
//	            break;
//	            
//	            default:
//	            	System.out.println("its invalid ");
//	            }    	
//	            
	}

}
