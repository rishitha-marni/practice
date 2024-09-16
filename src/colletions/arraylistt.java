package colletions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class arraylistt {

	public static void main(String[] args) {
		
		ArrayList<Integer> arr= new ArrayList<>();
		arr.add(1);
		arr.add(2);
	    arr.add(3);
	    arr.add(4);
	    arr.add(3);
		System.out.println(arr.indexOf(3));
		System.out.println(arr.lastIndexOf(3));
		//arr.clear(); --remove all elements
		List<Integer> arr5=arr.subList(2, 4);
		System.out.println(arr5);
		arr5.addAll(arr);
		System.out.println(arr5);
		arr5.addAll(2, arr5);
		System.out.println(arr5);
		arr.set(0, 10);
		arr.remove(2);
		Object[] arr1=arr.toArray();
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
	}
}
