package HackerRank.AlgorithmsPractice;

import java.util.ArrayList;
import java.util.List;

public class DiagonalDifference {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

	public static List<List<Integer>> createList(){
		
	List<List<Integer>> arr = new ArrayList<>();
	
	List<Integer> subArr1 = new ArrayList<>();
	subArr1.add(1);
	subArr1.add(2);
	subArr1.add(3);
	
	List<Integer> subArr2 = new ArrayList<>();
	subArr2.add(4);
	subArr2.add(50);
	subArr2.add(6);
	
	List<Integer> subArr3 = new ArrayList<>();
	subArr3.add(9);
	subArr3.add(8);
	subArr3.add(9);
	
	arr.add(subArr1);
	arr.add(subArr2);
	arr.add(subArr3);

	return arr;
	}
	
    public static int diagonalDifference(List<List<Integer>> arr) {
    	
//    	validate inputs
//    	validate values
    	
        for(int x=0; x<arr.size(); x++){
        	for(int y=0; y<arr.size(); y++) {	

        		int elmnt_value = arr.get(x).get(y);	

        		if (elmnt_value < -100) {
        			
        			System.out.printf("Element [%s], of value %s in list [%s] is not a valid integer - too little!", y, elmnt_value, x );
//        			Throw an error to the calling function

        		} 
        		else if (elmnt_value > 100) {
        			
        			System.out.printf("Element [%s], of value %s in list [%s] is not a valid integer - too large!", y, elmnt_value, x);
//        			Throw an error to the calling function
        		}
        	}
        }
        
        System.out.println("__________________________");
    	
//		**CODE BEGINS FOR FUNCTION diagonalDifference**
    
    int primarySum = 0;
    int secondarySum = 0;
    int absoluteDif = 0;
    
    for(int i = 0; i<arr.size(); i++) {
    	
    	System.out.println("Value added to primarySum is " + arr.get(i).get(i));
    	primarySum += arr.get(i).get(i);
    	
    	int n = arr.size()-1;
    	System.out.println("Value added to secondarySum is " + arr.get(n-i).get(i));
    	secondarySum += arr.get(n-i).get(i);
    
    	
    }
    System.out.println("__________________________");
    System.out.println("Value of primarySum is " + primarySum);
    System.out.println("Value of SecondarySum is " + secondarySum);
    
    absoluteDif = Math.abs(primarySum - secondarySum);
    
    System.out.println("__________________________");
    System.out.println("The absolute difference is " + absoluteDif);
    return absoluteDif;
    }

    public static void main(String[] args) {
    	
    	diagonalDifference(createList());
    	
    }
	
}
