package HackerRank.AlgorithmsPractice;

import java.util.ArrayList;
import java.util.List;

public class PlusMinus {

public static List<Integer> listMaker(){
		
		List<Integer> intList = new ArrayList<>();
		
		intList.add(-4);
		intList.add(3);
		intList.add(-9);
		intList.add(0);
		intList.add(4);
		intList.add(1);
		
		return intList;
	}
	
	
	
	
    public static void plusMinus(List<Integer> arr) {

//    	validate inputs
//    	validate size of the array
    	
    	int arrSize = arr.size();
    	
    	if(arrSize < 1 || arrSize > 101) {
//    		Throw an error to the calling function
    		System.out.printf("The array size of %s is not a valid array size!", arrSize);
    	}
    	
//    	validate array element values
    	
    	for(int i = 0; i < arrSize; i++) {
    		
    		int elementValue = arr.get(i);
    		
    		if(elementValue < -100 || elementValue > 100) {
    			
//    			Throw an error to the calling method
    			System.out.printf("Array element %s of value %s is not a valid array value!", i, elementValue);
    		}
    	}
    
    	
//    	**CODE FOR PlusMinus Function BEGINS HERE**
    	
    	double totalIntegers = 0.00;
    	double numPositive = 0.00;
    	double numNegative = 0.00;
    	double numOfZeros = 0.00;
    	
    	for(int j = 0; j < arr.size(); j++) {
    		
    		int elementValue = arr.get(j);
    		
    		if(elementValue > 0) {
    			
    			numPositive ++;
    			totalIntegers++;
    		}
    		else if (elementValue == 0) {
    			
    			numOfZeros++;
    			totalIntegers++;
    		}
    		else {
    			
    			numNegative++;
    			totalIntegers++;
    		}
    	}
    	
    	double percentPositive = numPositive/totalIntegers;
    	double percentNegative = numNegative/totalIntegers;
    	double percentZeros = numOfZeros/totalIntegers;
    	
    	System.out.printf("Percent of integers that are positive  = " + "%.6f", percentPositive);
    	System.out.printf("\nPercent of integers that are negative  = " + "%.6f", percentNegative);
    	System.out.printf("\nPercent of integers that are zero  = " + "%.6f", percentZeros);
    	
    	
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		plusMinus(listMaker());
		
	}
	
}
