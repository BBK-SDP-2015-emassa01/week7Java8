package example02;

public interface B extends A {
//	public String eats(); //everyone implements eats, but its a different implementation

	public default String eats(){
		return "Yep I sometimes eat";
	}

}
