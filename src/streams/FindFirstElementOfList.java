package streams;

import java.util.Arrays;
import java.util.List;

public class FindFirstElementOfList {
 
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,1);
		list.stream().findFirst().ifPresent(System.out::println);
		
		//total number of elements in list
		System.out.println("-----------count no. of elemts in list-----");
       long n= list.stream().count();
       System.out.println(n);
       
     //find max value in list
     		System.out.println("-----------find max value in list-----");
     		int r=list.stream().max(Integer::compare).get();
            System.out.println(r);
	}
}
