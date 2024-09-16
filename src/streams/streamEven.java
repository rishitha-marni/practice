package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class streamEven {
      public static void main(String[] args) {
    	  ArrayList<Integer> in=new ArrayList<>();
    	  in.add(1);
    	  in.add(2);
    	  in.add(3);
    	  
    	  List<Integer> inn= Arrays.asList(1,2,3,4);
    	  List<Integer> innn=new ArrayList<>(Arrays.asList(1,2,3,4,5));
    	  innn.stream().filter(n->n%2==0).forEach(System.out::println);
      }
}
