package msenibaldi;
import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.Stack;


public class ListParser {
/** Name: Stack Parser
 *  @author Matt Senibaldi
 *  Date: 9/20/2020
 *  Synopsis: This program will sort through a random list of elements and pull any usable data
 * @param args
 */
	static void showpush(Stack st, int a) {
		st.push(new Integer(a));
		System.out.println("push(" + a + ")");
		System.out.println("Stack: " + st);
	}
	
	static void showpop(Stack st) {
		System.out.print("pop >> ");
		Integer a = (Integer) st.pop();
		System.out.println(a);
		System.out.println("Stack: " + st);
	}
	
	
	
	
	public static void main(String[] args) {
		
		Stack st = new Stack();
		System.out.println("Stack: " + st);
		showpush(st, 1);
	    showpush(st, 2);
	    showpush(st, 3);
	    showpop(st);
	    showpop(st);
	    showpop(st);
	    
	    try {
	    	showpop(st);
	    } catch (EmptyStackException e) {
	    	System.out.println("Empty Stack");
	    }
		
		
		int [] numbers = new int[1000000]; // Generating a new array with 1 million elements
		for (int i = 0; i < numbers.length; i++) {
			// Filling the array with 0's
			
	}
		Arrays.asList(numbers);
		System.out.println(numbers[1000]);
		
		
}
}
