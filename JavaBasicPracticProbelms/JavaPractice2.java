package JavaBasicPracticProbelms;

public class JavaPractice2 {

	
	// JAVA PROGRAM REVERSE AN NUMBER....
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub


        int num = 321;
    while(num > 0) {
    	
    	int ans = 0;
    	ans = num %  10;	
    	System.out.print(ans);
    	num = num / 10;
    }
   
		
	}

}
