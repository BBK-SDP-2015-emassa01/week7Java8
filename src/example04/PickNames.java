package example04;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PickNames {
	public static void main(String[] args){
		
	List<String> friends = Arrays.asList("Betty", "Bob", "James", "Barnaby");
	
	friends.stream()
	.filter(name-> name.startsWith("B"))
	.forEach(System.out::println);
	//filters on 'B'
	
	
	/*
	 * Filter -> takes in a Predicate
	 * There is a Predicate Class.
	 * Statics do not operate upon objects.
	 * Lets make one
	 */
	Predicate<String> startsWithB = (name -> name.startsWith("B"));
//	this is using the 'test' method of the Predicate Class.
	
	friends.stream().filter(startsWithB).forEach(System.out::println);
	//filters on 'B'
	
	System.out.println(friends.stream().mapToInt(name->name.length()).sum());
	
	String s =
			friends.stream()
			.reduce("Fred", (name1, name2) -> //check out java.util.function
			name1.length() >= name2.length() ? name1 :name2);
	
	System.out.println(s);
	}
	
}
