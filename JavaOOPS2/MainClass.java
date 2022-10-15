package JavaOOPS2;


class Alien{
	 int legs;
	                                        //LETS CREATE A VARIABLE....
	 
   static boolean isMemberofEarth=false;   //STATIC BECOZ NO ONE OBJECT WILL CHANGE THE VARIABLE....
   
		void speak() {   //CREATE A NON-STATIC FUNCTION
			
			System.out.println("alien speak");
			sayHello();
			
	}
		
		void sayHello() {           //NON STATIC SE NON STATIC FUNCTION CaLL HO JATA HAI...
			
			System.out.println("alien saY HELL0");
		}
	 
}


public class MainClass {

	public static void main(String[] args) {
		
		Alien obj = new Alien();
		obj.speak();
	 
		
	}

}
 