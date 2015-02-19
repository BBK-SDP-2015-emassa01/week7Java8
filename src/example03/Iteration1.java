package example03;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Iteration1 {
	
	public static void main(String[] args){
	
	List<String> friends = Arrays.asList("Betty", "Bob", "James");

	for (int i = 0; i<friends.size(); i++)
		System.out.println(friends.get(i));
	
	for (String name:friends)
		System.out.println(name);
	
//	friends.forEach(action); 
	/*do we have to implement a consumer then? 
	 * eg below MyConsumer....
	 * Well no we can use an anonymous inner class!
	 */	
	
//	friends.forEach(new MyConsumer<>());
	//but we can have an anonymous inner class...

	
	friends.forEach(new Consumer<String>(){
		public void accept(String t) {
			System.out.println(t);
		}
	});
	
//	As there is only one NON-default method in Consumer, we can just do this lambda and it will be inferred...
	friends.forEach((String name) -> System.out.println(name)); //passing it to non-default method.
	friends.forEach(name -> System.out.println(name)); //another way to do the same.
	friends.forEach(System.out::println); //take the argument and pass it to here/println!
	
	//lets stream it.
	System.out.println("The stream: "+ friends.stream());
	
	friends.stream().map(name -> name.toUpperCase()).forEach(System.out::println);
	
	//or
	
	friends.stream().map (name -> name.length()) .forEach (count -> System.out.println(count));
	
	}


//We have an AIC -- so comment this out!
//	class MyConsumer<T> implements Consumer<T>{
//
//	@Override
//	public void accept(T t) {
//		// TODO Auto-generated method stub
//		System.out.println(t);
//		
//	}
//}
}