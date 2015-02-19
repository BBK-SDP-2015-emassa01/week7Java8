package example01;

import java.util.Arrays;
import java.util.List;

/*
 * Totals the discounts some items, a list of items, by about 10%
 */
public class Discount {
	
	public static void main(String[] args){
		
		final List<Integer> prices = Arrays.asList(10, 15, 20, 25);
		
		System.out.println("Total of discounted prices: " + discountImperative(prices));
		System.out.println("Total of discounted prices: " + discountFunctional(prices));
		
	}
	
	static Double discountImperative(List<Integer> prices){
		Double totalOfDiscountedPrices = 0.0;
		for (Integer i: prices){
			totalOfDiscountedPrices += i * 0.9;
		}
		return totalOfDiscountedPrices;
	}
	
	static Double discountFunctional(List<Integer> prices){
		//return prices.stream().mapToDouble((Integer price) -> price * 0.9).sum();
		//infers Integer
		return prices.stream().mapToDouble(price -> price * 0.9).sum();
		/*
		 * Advantages: -- could we do anything interesting at that point, i.e.,  use the 
		 * 'parallel()' method?
		 * Well if we do, then we have a threaded version of the program, and if it has multiple threads
		 * it will use more than one thread to complete the method (if not it will run it in one
		 * thread). 
		 */
	}

}
