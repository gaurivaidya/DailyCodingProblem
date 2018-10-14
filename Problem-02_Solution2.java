// Problem statement - Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.
//                       For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].

// Solution -			      
			      
public class DailyCodingProblem2_Solution2 {
		 
	    // epsilon value to maintain precision
	    static final double EPS = 1e-9;
	    public static void main(String args[])
	    {
	        int a[] = { 10, 3, 5, 6, 2 };
	        int n = a.length;
	        double sum = 0; 
	        for (int i = 0; i < n; i++)
	            sum += Math.log10(a[i]);
	        for (int i = 0; i < n; i++)
	            System.out.print((int)(EPS + Math.pow(10.00,
	                          sum - Math.log10(a[i]))) + " ");
	    }
	}
