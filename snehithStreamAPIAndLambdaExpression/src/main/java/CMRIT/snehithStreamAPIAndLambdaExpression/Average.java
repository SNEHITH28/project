package CMRIT.snehithStreamAPIAndLambdaExpression;

import java.util.Arrays;
import java.util.List;


public class Average {
	
	private static double toFindAverage(List<Integer> list1) {
		return ((double) (list1.stream()
						   	   .map(i -> i)
						       .reduce(Integer::sum)
						       .orElse(0))) / list1.size();
	}

	public static void main(String[] args) {
		
		/*
		 *  The list contain ->  [ 1,2,3,4 ] 
		 *  The sum of the list  -> 10
		 *  The size of the list  -> 4
		 *  The average of the list -> 2.5
		 */
		
		List<Integer> list1 = Arrays.asList(1,2,3,4);
		System.out.println("Average is :" + toFindAverage(list1));

		
		

	}


}
