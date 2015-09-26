package pt.pragmapilot.sorting;

/**
 * Implements common sorting algorithms.
 *
 * Usage: 
 * 
 * int [] array = {32, 39,21, 45, 23, 3};
 *		
 * Sorter sorter = new Sorter();
 *		
 * System.out.println("Unsorted: " + Arrays.toString(array));
 * int[] sorted = sorter.bubbleSort(array);
 * System.out.println("Sorted: " + Arrays.toString(sorted));
 * 
 * TODO: implement the others in https://en.wikipedia.org/wiki/Sorting_algorithm
 * TODO: implement generic versions
 */
public class Sorter {
	
	/**
	 * Implements Bubble sort.
	 * @param array the array to sort
	 * @return the sorted array
	 */
	public int[] bubbleSort(int[]array)
	{
		if(array.length > 1)
		{
			for(int i = 0; i <array.length-1; i++)
			{
				for(int j = 1; j < array.length-i; j++)
				{
					if(array[j-1] > array[j])
					{
						int temp = array[j];
						array[j] = array[j-1];
						array[j-1] = temp;
					}
				}
			}
		}
		
		return array;
	}
}
