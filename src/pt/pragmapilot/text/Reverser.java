package pt.pragmapilot.text;

/**
 * Implements text reversing algorithms.
 * 
 * The larger part of this class implementation is based on the premise that the input can be decomposed
 * into an array (an array of chars for a word, an array of strings for a sentence). This array is then 
 * reversed through a shared generic method and the result assembled back.
 * 
 * Usage:
 * Reverser reverser = new Reverser();
 *
 * System.out.println("*** Reverse word ***");
 *
 * final String word = "hitchhiker";
 *		
 * System.out.println("'" + word + "' reversed is: '"+ reverser.reverseWord(word) + "'");
 * System.out.println("'" + word + "' reversed is: '"+ reverser.compactReverseWord(word) + "' [COMPACT]");
 *		
 * System.out.println("*** Reverse sentence ***");
 *		
 * final String sentence = "hitchhiker's guide to the galaxy";
 * System.out.println("'" + sentence + "' reversed is: '"+ reverser.reverseSentence(sentence) + "'");
 * 
 */
public class Reverser {
	
	/**
	 * Reverses the given word.
	 * @param input the word to reverse
	 * @return the reversed word
	 */
	public String reverseWord(String input)
	{
		String result = input;
		
		if(input != null)
		{
			Character[] chars = this.toCharacterArray(input.toCharArray());
			chars = this.reverseArray(chars); 
			result = new String(this.toCharArray(chars));	
		}
		
		return result;
	}
	
	/** 
	 * Compact version of the previous method.
	 * Uses char instead of Character.
	 * @param input the word to reverse
	 * @return the reversed word
	 */
	public String compactReverseWord(String input)
	{
		String result = input;
		
		if(input != null)
		{
			char [] chars = input.toCharArray();
			final int length = chars.length;

			char temp;

			for (int i = 0; i != length/2; ++i)
			{
				temp = chars[i];
				chars[i] = chars[length-1-i];
				chars[length-1-i] = temp;
			}

			result = new String(chars);
		}

		return result;
	}
	
	/**
	 * Reverses the given sentence. 
	 * @param input the string to reverse
	 * @return the reversed string
	 */
	public String reverseSentence(String input)
	{
		String result = input;
		
		if(input != null)
		{
			String[] components = input.split(" ");
			String[] reversedComponents = this.reverseArray(components);
		
			result = this.join(reversedComponents, ' ');
		}
		
		return result;
	}
	
	/**
	 * Generic method that reverses an array.
	 * @param input the array to reverse
	 * @return the reversed array
	 */
	private <Type> Type[] reverseArray(Type[] input)
	{
		Type temp;
		
		final int length = input.length;
		
		for(int i = 0; i != (length /2); ++i)
		{ 
			temp = input[i];
			input[i] = input[length-1-i];
			input[length-1-i] = temp;
		}
		
		return input;
	}
	
	/**
	 * Joins an array of strings into one string, using the given char as separator between strings.
	 * @param input the array of strings to join
	 * @param separator the separator (word boundary)
	 * @return a string comprised of the joined strings separated by the char
	 */
	private String join(String[] input, char separator)
	{
		String result = "";
		
		final int length = input.length;
		
		for(int i = 0; i != length ; ++i)
		{
			result += input[i];
			
			if(i != length-1)
				result += separator;
		}
		
		return result;
	}
	
	/**
	 * Converts a char[] into a Character[].
	 * @param input the char array
	 * @return a Character array
	 */
	private Character[] toCharacterArray(char [] input)
	{
		final int length = input.length;
		
		Character [] result = new Character[length];
		
		for(int i = 0; i != length; ++i)
		{
			result[i] = new Character(input[i]);
		}
		
		return result;
	}
	
	/**
	 * Converts a Character[] into a char[].
	 * @param input the Character array
	 * @return a char array
	 */
	private char[] toCharArray(Character[] input)
	{
		final int length = input.length;
		
		char [] result = new char[length];
		
		for(int i = 0; i != length; ++i)
		{
			result[i] = input[i].charValue();
		}
		
		return result;
	}
}
