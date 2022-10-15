package JavaOOPS2;

public class LearnEncapsulation {

	public static void main(String[] args) {
		
		bankAccount obj = new bankAccount();
		obj.setAmount(1234,5000);             //WE WANT NOBODY CHANGE DATA  ITSELF  
		System.out.println(obj.getAmount());
	}
	
}

class bankAccount{
	
	public int getAmount() {
		return amount;
	}

	
	int otp=1234;
	private int amount;  //not chnages by others
	 
	 public void setAmount(int otp , int amount) {
		  if(otp==this.otp) {
			  
			  this.amount = amount;
		  }
		 
	 }
}