package JavaOOPS2;


class Samsung extends MobilePhone{
	void playGames() {
		
		System.out.println(" Samsung Play Games");
		
		
	}
}
	
	class Apple extends MobilePhone{
		
		void playGames() {
			System.out.println("Apple has Better User Interface");
		}
	
	}

	class MobilePhone{
		
		boolean hasHeadphoneJack;  //THIS IS TRUE OR FALSE VARIABLE....
		String os;
		int price;
		int dimen;
		
		
	}
public class LearnInheritance {

	public static void main(String[] args) {

  Samsung s10 =  new Samsung();
      s10.playGames();
      
      Apple i14 = new Apple();
      i14.playGames();
	}

}
