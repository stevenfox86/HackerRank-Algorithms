package HackerRank.AlgorithmsPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MiniMaxSum {

public static List<Integer> createList(){
		
		List<Integer> nums = new ArrayList<>();
		nums.add(256741038);
		nums.add(623958417);
		nums.add(467905213);
		nums.add(714532089);
		nums.add(938071625);
		return nums;
	}

	public static void miniMaxSum(List<Integer> arr) {
	    // Write your code here

//		validate inputs
//		validate array size
		
		int arrSize = arr.size();
		
		if(arrSize != 5) {
			
//			Throw an error to the calling function
			System.out.printf("The array of size %s is not a valid array size!", arrSize);
		}

		
//		validate array element values
		
		for(int i = 0; i < arr.size(); i ++) {
			
			Integer arrElementVal = arr.get(i);
	
			if(arrElementVal < 1 || arrElementVal > 1000000000) {
			
//				Throw an error to the calling function
				System.out.printf("Array value %s is not a valid array element value!", arrElementVal);
				
			}	
	    }
		
		
//		**CODE FOR miniMaxSum BEGINS HERE!**
		
		Integer[] intArray = new Integer[arr.size()];
		
		intArray = arr.toArray(intArray);
		
		Arrays.sort(intArray);
		
		int arrLength = intArray.length;
		Long minSum = 0L;
		Long maxSum = 0L;
		
		for(int j = 0; j < arrLength-1; j++) {
			
			minSum += intArray[j];
			System.out.println("minSum currently = " +minSum);
		}
		
		for(int k = arrLength-1; k > 0; k--) {
			
//			System.out.println(intArray[k]);
			maxSum += intArray[k];
			System.out.println("maxSum currently = " +maxSum);
		}
		
		System.out.println("The minSum is " + minSum + " " + "The maxSum is " + maxSum);
	}
	
	public static void main(String[] args) {
		miniMaxSum(createList());
	}
	
}
