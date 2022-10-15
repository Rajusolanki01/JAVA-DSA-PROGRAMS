package JavaBasicPracticProbelms;

import java.util.Scanner;

public class JavaPractice7 {

	public static void main(String[] args) {
		 //java program find factorial

        Scanner sc = new Scanner(System.in);
          System.out.println("enter the number");       
          int num = sc.nextInt();
          int i = 1 ,fact = 1;
          while(i<=num) {

           fact = fact*i;
           i++; 
         }

          System.out.println(" factorial number is : " + fact );

 
          
 
	        }
	
        }  

    


