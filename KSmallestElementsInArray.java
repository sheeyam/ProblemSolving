import java.util.Arrays;

public class KSmallestElementsInArray {

	public static void main(String[] args) {
		// Number Array
		Integer[] numArray = new Integer[] {23, 56, 2, 7, 14};
    
    //K-Times
		int k = 3;
		
    // NumArray On Descending Order
		Integer[] ascNumArray = SortArrayASC(numArray);
		
    //Loop through the first k values and print.
		for(int x = 0; x < k; x++) {
			System.out.println(ascNumArray[x]);
		}
	}
	
  // Sort Array in Ascending Order
	public static Integer[] SortArrayASC(Integer[] array) {
		Arrays.sort(array);
		return array;
	}
}
