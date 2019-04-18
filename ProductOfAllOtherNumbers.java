/* PROBLEM STATEMENT
Write a method  that takes an array of integers and returns an array of the products.
For example, 
given: [1, 7, 3, 4]
your method would return: [84, 12, 28, 21]
by calculating: [7 * 3 * 4, 1 * 3 * 4, 1 * 7 * 4, 1 * 7 * 3]

** You can't use division in your solution!

*/

import java.util.Arrays;

public class ProductOfAllOtherNumbers {

	public static void main(String[] args) {
		// Number Array
		int numArray[] = new int[] {3, 1, 2, 5, 6, 4};
		// Result Array
		int resArray[] = getProductOfAllOtherNumbers(numArray);
		// Output
		System.out.println("Product of All other Numbers: " + Arrays.toString(resArray));
	}
	
	public static int[] getProductOfAllOtherNumbers(int[] numArray) {
		int productOfOtherNums[] = new int[numArray.length];
		
		// Calculate the products of the number before index
		int currentProduct = 1;
		for(int i = 0; i < numArray.length; i++) {
			productOfOtherNums[i] = currentProduct;
			currentProduct *= numArray[i];
		}
		
		// Calculate the products of the number after index and append
		currentProduct = 1;
		for(int i = numArray.length - 1; i >= 0; i--) {
			productOfOtherNums[i] *= currentProduct;
			currentProduct *= numArray[i];
		}
		return productOfOtherNums;
	} 
}
