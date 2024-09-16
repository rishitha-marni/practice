package colletions;

import java.util.ArrayList;
import java.util.List;

public class IterateListUsingLambda {
    public static void main(String[] args) {
    	List<Integer> lis= new ArrayList<>();
    	lis.add(1);
    	lis.add(2);
    	System.out.println(lis);
    	//lis.forEach((t-> System.out.println(t)));
    	lis.stream().forEach(t-> System.out.println(t));
    }
}
