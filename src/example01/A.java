package example01;

public interface A {
	
//	public String eats(); //everyone has to implement 'eats()' so lets just write some code in the interface?

//	public String eats(){
//		return "I do eat!"; // BUT as an interface this does not compile...
//	}

	/* 
	 * So Java 8 added a 'default' in interfaces...
	 */

	public default String eats(){
		return "Yep I do eat";
	}
	
	public default void anotherOne(){
		//doNothing!
	}

}
