package ArrayClassBasic;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraySwap {

	public static void main(String[] args) {
		// java array swap method..
		
         //create a list with  item..
		
		List<Integer>list = Arrays.asList(15,14,12,13);

		System.out.println("Orinal array " + list);
		
		
		Collections.swap(list, 1, 3);
		
		System.out.println("After Swap " + list);
	}

}

