// Problem statement - Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
//                     For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.

// Solution -

public class DailyCodingProblem1 {
	public static void main(String[] args) {
		int[] arr= {10,15,3,7};
		int k=22;
		DailyCodingProblem1 dcp1=new DailyCodingProblem1();
		System.out.println(dcp1.addUp(arr,k));
	}
	public boolean addUp(int[] arr,int k) {
		boolean a=false;
		for(int i=0;i<arr.length;i++) {
			for(int j=1;j<arr.length;j++) {
				if((arr[i]+arr[j])==k)
					a=true;
			}
		}
		return a;
	}
}
