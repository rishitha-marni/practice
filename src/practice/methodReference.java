package practice;

import java.util.Arrays;
import java.util.List;

public class methodReference {
      public static void main(String[] args) {
    	  List<Integer> lk= Arrays.asList(1,2,3,4);
    	  
    	  methodReference mm= new methodReference();
			/*
			 * lk.forEach(mm :: printnum); lk.forEach(methodReference :: printnum);
			 */
      }
      
      public static void printnum(int n) {
    	  System.out.println(n+" ");
      }
}
