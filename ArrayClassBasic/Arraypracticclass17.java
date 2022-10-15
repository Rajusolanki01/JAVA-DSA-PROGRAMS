package ArrayClassBasic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Arraypracticclass17 {
	
	// there is input give by user 
	// input array = 10,20,30,40,50
	//output  sum will be = 150
	// but you have create a logic to output will be 160,170,180,190,200...

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10,20,30,40,50);
		
		Integer sum = numbers.stream().reduce(0, Integer::sum);
		
		List<Integer> transformedlist = numbers.stream().map(x -> x + sum).collect(Collectors.toList());
		
		System.out.println(transformedlist);
	}

}
