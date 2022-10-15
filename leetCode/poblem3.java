package leetCode;

public class poblem3 {

	// poor pig problem..
	
	
	 public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
		 return (int)Math.ceil(Math.log(buckets)/Math.log( minutesToTest/minutesToDie+1));
		     }
	
	public static void main(String[] args) {
	
	}

}
