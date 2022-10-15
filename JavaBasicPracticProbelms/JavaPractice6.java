package JavaBasicPracticProbelms;

public class JavaPractice6 {

	public static void main(String[] args) {
	
		  //program identify prime number
		
		int num = 83;                   
		boolean flag = false;
		for(int i=2; i<=num/2;i++) {
			
			if(num % i==0) {
				
				flag=true;
				break;
			}
			
		}
		if(!flag) {
			
			System.out.println(num  + " prime number");
		}else {
			System.out.println(num  + " not  prime number");
		}

	}

}
