//Example on page 880

package chapter13Examples;

public class LargestElementInArray {

	public static void main(String[] args) {
		int [] intArray = {23, 43, 35, 38, 67, 12, 76,
							10, 34, 8};
		
		System.out.println("Largest Element in intArray is: " + largest(intArray, 0, intArray.length-1));

	}

	//Method largest.
	public static int largest(int[] list, int lowerIndex, int upperIndex)
	{
		int max;
		if(lowerIndex == upperIndex)
			return list[lowerIndex];
		
		else
		{
			max = largest(list, lowerIndex +1, upperIndex);
			if(list[lowerIndex] >= max)
				return list[lowerIndex];
			else
				return max;
		}
		
	}
	
	
}
