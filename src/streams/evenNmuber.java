package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class evenNmuber {
    public static void main(String[] args) {
		
		  Scanner sc= new Scanner(System.in);
		  System.out.println("enter numbers: ");
		  String input= sc.nextLine();
		 
		  List<Integer> inputt=Arrays.stream(input.split("\\s+"))
				  .map(Integer::parseInt).
				  collect(Collectors.toList());
		  inputt.stream().filter(n->n%2==0).forEach(System.out::println);
         sc.close();
		  System.err.println("-----------");
    	List<Integer> list=Arrays.asList(1,2,37,47,5,6,40,90);
    	list.stream().filter(n -> n%2==0).forEach(System.out::println);
    }
}
