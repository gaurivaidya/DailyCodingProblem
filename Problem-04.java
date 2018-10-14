//  Problem statement - Given an array of integers, find the first missing positive integer in linear time and constant space. In other words, find the lowest positive integer that does not exist in the array. The array can contain duplicates and negative numbers as well.
//                       For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.
//                       You can modify the input array in-place.
                     
// Solution - 

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DailyCodingProblem4 {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(4,3,-1,1);
		int max=Collections.max(list);
		int min=Collections.min(list);
		//System.out.println(min+""+max);
		int a=0,b=0;
		for(int i=min;i<max;i++) {
			if(!list.contains(i)&&i!=0) {
				a=i;
				System.out.println(a);
			}else{
				b=max+1;
				System.out.println(b);
			}
		}
	}
}
