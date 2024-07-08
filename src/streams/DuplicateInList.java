package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateInList {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(12,12,4,6,55,55);
		Set<Integer> set=new HashSet<>();
		list.stream().filter(n -> !set.add(n)).forEach(System.out::println);
	} 
}
