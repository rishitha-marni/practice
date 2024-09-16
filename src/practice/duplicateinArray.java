package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class duplicateinArray {
      public static void main(String[] args) {
    	  
    	  List<Integer> arr= Arrays.asList(1,2,2,3);
    	  Set<Integer> ae=new HashSet<>();
    	  arr.stream().filter(n->!ae.add(n)).forEach(System.out::println);
    	  
    	  System.out.println("-------------");
    	  int[] arr1= {1,2,34,34,2};
    	  for(int i=0;i<arr1.length;i++) {
    		  for(int j=i+1;j<arr1.length;j++) {
    			  if(arr1[i]==arr1[j]) {
    				  System.out.println(arr1[i]);
    				  break;
    			  }
    		  }
    	  }
    	  System.out.println("-----------");
    	  int[] arr2= {1,5,16,16};
    	  Arrays.sort(arr2);
    	  for(int i=0;i<arr2.length-1;i++) {
    		  if(arr2[i]==arr2[i+1]) {
    			  System.out.println(arr2[i]);
    		  }
    	  }
       }
}
