package pt.pragmapilot.limits;

/** 
 * Calculates limits of arrays.
 * 
 * Usage: 
 *		
 * int [] values = {56, 427, 8, 23, 17, 3, 888, 102, 163, 36};
 *
 * Limits limits = new Limits();
 *
 * System.out.println("List: " + Arrays.toString(values));
 * System.out.println("Min: " + limits.minimumOf(values));
 * System.out.println("Max: " + limits.maximumOf(values));
 *
 */
public class Limits {
	
	/**
	 * Calculates the lowest value of the given int array.
	 * @param list a list of ints
	 * @return the lowest value on the list
	 */
	public int minimumOf(int [] list)
	{
		int min = list[0];
		
		for (int i = 1; i != list.length; ++i)
		{
			if(list[i] < min)
				min = list[i];
		}
		
		return min;
	}
	
	/**
	 * Calculates the highest value of the given int array.
	 * @param list a list of ints
	 * @return the highest value on the list
	 */
	public int maximumOf(int [] list)
	{
		int max = list[0];
		
		for (int i = 1; i != list.length; ++i)
		{
			if(list[i] > max)
				max = list[i];
		}
		
		return max;
	}
}
