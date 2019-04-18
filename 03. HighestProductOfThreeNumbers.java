/* PROBLEM STATEMENT
Given an array of integers, find the highest product you can get from three of the integers.
The input array will always have at least three integers.
Method should work with negative numbers
 */

public class HighestProductOfThreeNumbers {

	public static void main(String[] args) {
		int numArray[] = new int[] {1, 10, -5, 1, -100};
		System.out.println("Highest Product of Three Numbers: " + getHighestProductOfThreeNums(numArray));
	}
	
	public static int getHighestProductOfThreeNums(int[] numArray) {
		
		if (numArray.length < 3) {
			throw new IllegalArgumentException("Less than 3 items!");
		}
		
		int highest = Math.max(numArray[0], numArray[1]);
		int lowest = Math.min(numArray[0], numArray[1]);
		
		int highest2 = numArray[0] * numArray[1];
		int lowest2 = numArray[0] * numArray[1];
		
		int highest3 = numArray[0] * numArray[1] * numArray[2];
		
		for (int i = 2; i < numArray.length; i++) {
			int current = numArray[i];

			highest3 = Math.max(highest3, Math.max((current * highest2), (current * lowest2)));
			
			highest2 = Math.max(highest2, Math.max((current * highest), (current * lowest)));
			lowest2 = Math.min(lowest2, Math.min((current * highest), (current * lowest)));
			
			highest = Math.max(numArray[i], current);
			lowest = Math.min(numArray[i], current);
		}
		return highest3;
	}
}
