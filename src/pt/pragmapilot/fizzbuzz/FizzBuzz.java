package pt.pragmapilot.fizzbuzz;

/** 
 * Several implementations for the "FizzBuzz" (& variations) problem.
 * Most of the methods allow you to pass a starting value so you can "fizzbuzz" say from 23 to 738.
 * 
 * Usage: 
 * 
 *  FizzBuzz fizzBuzz = new FizzBuzz();
 *  fizzBuzz.classic(1,100);
 *  fizzBuzz.compact(1, 100);
 *  fizzBuzz.concatentation(1, 100);
 *  fizzBuzz.recursive(100);
 *  fizzBuzz.woof(24);
 *  
 */
public class FizzBuzz {

	/** 
	 * Classic solution based on if-else. 
	 */
	public void classic(int start, int end)
	{
		System.out.println("***Classic***");
		
		for (int i = start ; i <= end; ++i)
		{
			if((i % 3) == 0 && (i % 5) == 0)
			{
				System.out.println("FizzBuzz");
			}
			else if ((i % 3) == 0)
			{
				System.out.println("Fizz");
			}
			else if ((i % 5) == 0)
			{
				System.out.println("Buzz");
			}
			else 
			{
				System.out.println(i);	
			}
		}
		
		System.out.println("--------------------------");
	}
	
	/** 
	 * Compact version (ab)using ternary operator. 
	 */
	public void compact(int start, int end)
	{
		System.out.println("***Compact***");
		
		for (int i = start ; i <= end; ++i)
		{
			System.out.println((i % 15) != 0 ? (i % 5) != 0 ? (i % 3) != 0  ? i : "Fizz" : "Buzz" : "FizzBuzz");	
		}
		
		System.out.println("--------------------------");
	}
	
	/** 
	 * This solution uses a string which has fizz/buzz/fizzbuzz/value concatenated. 
	 */
	public void concatentation(int start, int end)
	{
		System.out.println("***Concatenation***");
		
		String output;
		
		for (int i = start ; i <= end; ++i)
		{
				output = "";
				if((i % 3) == 0)
				{
					output += "Fizz";
				}
				if((i % 5) == 0)
				{
					output += "Buzz";
				}
				if(output == "")
				{
					output += i;
				}
				
				System.out.println(output);
		}
		
		System.out.println("--------------------------");
	}
	
	/** 
	 * If the number is divisible by 7 it prints "woof"... 
	 */
	public void woof(int end)
	{
		System.out.println("***FizzBuzzWoof***");
		
		String output;
		
		for (int i = 1 ; i <= end; ++i)
		{
				output = "";
				if((i % 3) == 0)
				{
					output += "Fizz";
				}
				if((i % 5) == 0)
				{
					output += "Buzz";
				}
				if((i % 7) == 0)
				{
					output += "Woof";
				}
				if(output == "")
				{
					output += i;
				}
				
				System.out.println(output);
		}
		
		System.out.println("--------------------------");
	}
	
	/** 
	 * Recursive solution. This is the entry point.
	 */
	public void recursive(int end)
	{
		System.out.println("***Recursive***");
		
		System.out.println(p_recursive(end));
		
		System.out.println("--------------------------");
	}
	
	/** 
	 * Recursive solution. This methods calculates "fizzbuzz" for one value.
	 */
	private String p_recursive(int n)
	{
		String result = "";
		
		if (n == 0)
			return result;
		if(n % 3 == 0)
			result += "Fizz";
		if(n % 5 == 0)
			result += "Buzz";
		if(result == "")
			result += n;

		result += "\n";
		
		return p_recursive(n-1) + result;
	}
}
