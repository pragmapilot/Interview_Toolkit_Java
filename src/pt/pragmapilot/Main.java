package pt.pragmapilot;

import pt.pragmapilot.fizzbuzz.FizzBuzz;

/**
 * Launcher
 * 
 * TODO: make a selection menu
 */
public class Main {
	
	/**
	 * The main! 
	 * 
	 * @param args the command line args
	 */
	public static void main(String[] args) {

		// Launch your examples from here...
		FizzBuzz fizzBuzz = new FizzBuzz();
		fizzBuzz.classic(1,100);
		fizzBuzz.compact(1, 100);
		fizzBuzz.concatentation(1, 100);
		fizzBuzz.recursive(100);
		fizzBuzz.woof(24);
	}

}
