package ArrayClassBasic;

import java.util.Scanner;

public class ArraysMain {

	public static void main(String[] args) {
		
		int[] ageList = new int[3];
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the roll no.");
		for(int i = 0; i<3; i++) {
			ageList[i] = sc.nextInt();
			
		}
		
		for( int i = 0; i<3; i++){
			System.out.println(" Age of roll no " + (i+1) +" is : " + ageList[i]);
		}

	}

}
