package ArrayClassBasic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Arraystring {
	
	// array string question\
	//input { "japan","india","america","usa"}
	//output {"JAPAN","INDIA"."AMERICA"."USA"}

	public static void main(String[] args) {
		
		List<String>countries = Arrays.asList("japan","india","america","usa");
		
		String str = countries.stream().map(x -> x.toUpperCase()).collect(Collectors.joining(","));
        
		System.out.println(str);
	}

}
