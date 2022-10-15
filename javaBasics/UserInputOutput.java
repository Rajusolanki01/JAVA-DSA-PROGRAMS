package javaBasics;

import java.util.Scanner;

public class UserInputOutput {

	public static void main(String[] args) {
	
      Scanner sc = new Scanner(System.in);
      
      
      System.out.println("my age is ");
    int age = sc.nextInt();
   
      System.out.println("my age is " + age);
      
      sc.nextLine(); 
      
      System.out.println("my name is");
		
      String  name = sc.nextLine();// nextline se string input kara skte hai 
		
		 System.out.println("your name is "  + name);
	
		
	}

}
