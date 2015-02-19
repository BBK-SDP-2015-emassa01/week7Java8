package example04;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class PickFirst {
	
	public static void main(String[] args){
		
		List<String> friends = Arrays.asList("Betty", "Bob", "James", "Barnaby", "Frank", "Noel", "Liam", "Fiona");
	/*
	 * We want to find the first occurrence of some name 'foundName' in the list
	 */
		Optional<String> foundName = 
				friends.stream().
				filter(name -> name.startsWith("G"))
				.findFirst();
				/*findFirst is a terminator, so it will do something for me! Remember we haven't declared foundName as 'null'
				 * like we would have to do in the imperative way.
				 * We would also have to do 'if (foundName!= null) //do something, else, something else...
				 * But...this is a lot of code, so we can use the OPTIONAL types.
				 * Option is a Box, has a String (or something) in it, otherwise it can be NULL.
				 */
		System.out.println("A name starting with 'G' " + foundName.orElse("was not found!"));
		/*
		 * what happens if foundName is null?
		 * This is what the .orElse(something to do if null) 
		 * comes in.
		 */
	}
}
