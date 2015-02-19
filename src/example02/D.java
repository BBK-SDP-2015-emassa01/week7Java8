package example02;


//public class D extends B, C { //no MI in Java! So we create interfaces...
public class D implements B, C {
	/*what does D implement?? which version of eat?
	 * If there is a collision above, then the class 
	 * has to implement a method to make a decision about which version of the method to call.
	 */
	
	public String eats(){
		return "ahhhhhh!";
	}
	
	/*
	 * Muddied the workspace but we REALLY needed this feature!
	 */


}


