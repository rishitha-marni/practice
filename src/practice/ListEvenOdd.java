package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class ListEvenOdd {
   
	public static void main(String[] args) {
		List<Integer> arr= Arrays.asList(1,2,3,4,5,6,7,8,9);
		int[] arr1= {1,2,3,4,5};
		List<Integer> even=new ArrayList<>();
		List<Integer> odd=new ArrayList<>();
		
		even =arr.stream().filter(n->n%2==0).collect(Collectors.toList());
		odd =arr.stream().filter(n->n%2!=0).collect(Collectors.toList());
		
		System.out.println(even+" "+ odd);
		for(int i:arr) {
			if(i%2==0) {
				even.add(i);
			}
			else {
				odd.add(i);
			}
		}
		System.out.println(even+" "+ odd);
	}
}
