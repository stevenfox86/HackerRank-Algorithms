package HackerRank.AlgorithmsPractice;

public class Staircase {
	
static int n =6;
	
	public static void staircase(int n) {
	    // Write your code here

//		validate input
//		validate number of stairs
		
		if(n < 1 || n > 100) {
		
//			Throw an error to the calling function
			System.out.printf("The number %s is an invalid input integer!", n);
		}
		
		
//		**CODE FOR staircase BEGINS HERE**
		
		
		String stair = "#";
		String space = " ";
		
		for(int i = 1; i <= n; i++) {
			
//			**The .repeat method is a working feature in JAVA 11**
//			System.out.println(space.repeat(n-i) + stair.repeat(i));
			
//			alternative archaic methodology
			String repeatedSpace = new String(new char[n-i]).replace("\0", space);
            String repeatedStair = new String(new char[i]).replace("\0", stair);
            System.out.println(repeatedSpace + repeatedStair);			
			
		}
		
	
	    }
	
	public static void main(String[] args) {
		staircase(n);
	}

}
