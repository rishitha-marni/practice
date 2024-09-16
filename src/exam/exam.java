package exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.StringJoiner;
import java.util.function.Function;

public class exam {
	public static void main(String[] args) {
	List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
	Optional<Integer> first= numbers.stream().findAny();
	first.ifPresent(System.out::println);
	
	//numbers.parallelStream().forEach(System.out::println);
	
	Function<String, String> nn= (n) ->n.toLowerCase();
	System.out.println(nn.apply("HELL"));
	
	List<Integer> nnn=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
	int res=nnn.stream().filter(n->n%2==0).map(n->n*n).reduce(0,Integer::sum);
	System.out.println(res);
	
	 Optional<String> optionalValue = Optional.ofNullable(null);
     
     // Using orElse() to provide a default value
     String result = optionalValue.orElse("Default Value");
     
     System.out.println(result); 
    
     StringJoiner n= new StringJoiner(",","[","]");
     n.add("a").add("b").add("c");
     
     StringJoiner n1= new StringJoiner(":");
     n1.add("p").add("q");
     
     n.merge(n1);
    
     System.out.println(n);
     
int[] arr= {1,2,3,4,5};
int[] arr2= {1,2,4,9,7,8};


for (int i = 0; i < arr.length; i++) {
	for (int j = 0; j < arr2.length; j++) {
		if (arr[i] == arr2[j]) {
			System.out.println(arr[i]);
		} else {
			continue;
		}
	}
}
 
   
HashSet<Integer> set= new HashSet<>();
for(int i=0;i<arr.length;i++) {
	set.add(arr[i]);
}
for(int i=0;i<arr2.length;i++) {
	if(set.contains(arr2[i])) {
		System.out.println(arr2[i]);
	}
}

}
	
}
