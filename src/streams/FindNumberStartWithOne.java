package streams;

import java.util.Arrays;
import java.util.List;

public class FindNumberStartWithOne {

	public static void main(String[] args) {
	List<Integer> list= Arrays.asList(1,13,24,77,71,16);
	list
	.stream()
	.filter(n-> String.valueOf(n).startsWith("1"))
	.forEach(System.out::println);
	System.out.println("---------ends with 7--------");
	list.stream().filter(n-> String.valueOf(n).endsWith("7")).forEach(System.out::println);
	}
}
