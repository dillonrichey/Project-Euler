
/**
 * @author dillonrichey
 * 
 * This program sums all of the numbers that are multiples of
 * 3 or 5 (or both) between 0 and 1000 (not inclusive). The sum
 * of these numbers is printed to the console.
 *
 */
public class SumOfMultiples {

public static void main (String args[]){
	
	int multipleSum = 0;
	
	//loops through numbers 0-999
	for (int i = 0; i < 1000; i++) {
		/*
		 * checks if each number is a multiple of either 3 or 5
		 * (or both) and adds it to the sum of multiples if it is
		 */
		if (i % 3 == 0) {
			
			multipleSum += i;
			
		} else if (i % 5 == 0) {
			
			multipleSum += i;
		}
		
		System.out.println(multipleSum);
		
	}
	
	
}

}
