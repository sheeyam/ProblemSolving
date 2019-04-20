import java.util.Arrays;
import java.util.Collections;

public class KLargestElementsInArray {

	public static void main(String[] args) {
		// Number Array
		Integer[] numArray = new Integer[] {23, 56, 2, 7, 14};
    
    		//K-Times
		int k = 3;
		
    		// NumArray On Descending Order
		Integer[] descNumArray = SortArrayDESC(numArray);
		
   		 //Loop through the first k values and print.
		for(int x = 0; x < k; x++) {
			System.out.println(descNumArray[x]);
		}
	}
	
  	// Sort Array in Descending Order
	public static Integer[] SortArrayDESC(Integer[] array) {
		Arrays.sort(array, Collections.reverseOrder());
		return array;
	}
}
