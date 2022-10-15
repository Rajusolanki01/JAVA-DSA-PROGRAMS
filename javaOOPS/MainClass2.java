package javaOOPS;

class Person{
	
	String name;
	int age;
	
	static int count;   //THIS BELONG A CLASS RATHER THAN A SPECIF INSTANCES ..
	
	
	 public Person() {
		count++;              //PERSON ME DEFINE KR DIYA 
		System.out.println("Person being created ");
	}
	 
	 
	  public Person(String name, int age){ //YE CONSTRUCTOR UPAR VALE CLASS PERSON NAME KO ACCESS KR RHA HAI
		 
		 this();                      // WE CREATE THIS FOR PASSING {THIS} ARGUMENTS ON CONSTRUCTOR...
		 this.name = name;
		 this.age= age;              //NOT USE NEWNAME KEYWORD SIMPLY USE THIS, KEYWORD LIKE THIS-
		 
		 
		 Walking(this);  // USE FOR VOID WALKING USING (THIS ) KEYWORD...
	 }
	 
	 void Walking(Person obj) {       // NOW WE CREATE (PERSON OBJ)ARGUMENT FOR CONSTRUCTOR OVERLOADING
		 
		 System.out.println(name + "  is waking");
	      age+=10;                                          // PERSON AGE IS INCREMENT ...
		 
	 }
	 
}

public class MainClass2 {

	public static void main(String[] args) {
                                                     //ACCESS KRNE KE OBJECT CREATE KRA PADEGA                                         
		Person p1 = new Person("RAJU",25);  
		  
		
           System.out.println(p1.name + " " + p1.age);    
          System.out.println(Person.count);
	}

}
