package example02;

public interface C extends A {
	
//	public String eats(); //another implementation of eats();
	
	public default String eats(){
		return "Yep I regularly eat";
	}


}
