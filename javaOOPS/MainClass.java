package javaOOPS;





	class Student{    //CLASS HAVE RETRUN VALUE;
		
		
		int age;   //PROPERTY AND BEHVIOUR
		int roll;
        String name;
        
        
        void groundWalk() {          //ThIS IS FIRST FUNCTION
        	
        	System.out.println("Raju is walking");
        }                                           
                                                       //VOID HAVE NO RETRUN VALUE;
        
        void groundWalk(int Steps) {  //THIS IS SECOND FUNCTION 
        	
        	
        	System.out.println("Raju is " + Steps + " Steps Walking" );
        	
        	
        	
            //BOTH ARE SAME METHODS SAME NAME BUT DIFFERENET SIGNATURE CALLED METHOD OVERLOADING....
        	
        	
        }
        
        
        //LETS CHECK CONSTRUCTOR OVERLOADING
        
        public  Student() {
        	System.out.println("THEY HAVE MUCH MORE STUDENTS");  // PUBLIC HAVE RETRUN VALUE;
        }
		
        
        public Student(String newName) {  // CREATE SECOND CONSTRUCTOR WITH DIFF PARAMETERS...
        	 System.out.println(newName + " WHILE PASSSED ALL STUDENTS ");
        	
        }
        
	}
	
	public class MainClass {
	

	public static void main(String[] args) {
		 
		Student s1 = new Student ();        //CREATE AN OBJECT STARTING THIS WITH HELP (NEW) KEY WORD
		Student s2 = new Student("TARUN");  //CREATE AN CONSTRUCTOR OBJECT WITH HELP (NEW) KEY WORD
		
		
		s1.name = "raju";
		s1.roll =   25;         // THIS IS OBJECTS CLASS OJECTS INSIMPLE 
		s1.age  =    24;                                      //THIS  IS ALSO STATIC VARIABLE...
		System.out.println("Student name " + s1.name );
		System.out.println("Student age " + s1.age );
		System.out.println("Student roll " +s1.roll );
		  
		s1.groundWalk();
		s1.groundWalk(10); // THIS IS FUNCTION CALLING 
		

	}

}
