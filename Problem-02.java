// Problem statement - Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.
//                       For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].

//Solution -

public class DailyCodingProblem2 {
	public static void main(String[] args) {
		int[] arr= {3,2,1};
		int n=arr.length;
		int[] left=new int[n];
		int[] right=new int[n];
		int[] product=new int[n];
		left[0]=1;
		right[n-1]=1;
		for (int i = 1; i < left.length; i++) {
			left[i]=arr[i-1]*left[i-1];
		}
		for (int i = n-2; i >= 0; i--) {
			right[i]=arr[i+1]*right[i+1];
		}
		for(int i=0;i<n;i++) {
			product[i]=left[i]*right[i];
		}
		for (int i = 0; i < product.length; i++) {
			System.out.print(product[i]+" ");
		}
	}
}
