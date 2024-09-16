package streams;

import java.util.Optional;

public class OptionalClassss {

	public static void main(String[] args) {
		String[] s= new String[10];
		s[5]="next";
		Optional<String> checkNullValue=Optional.ofNullable(null);
		System.out.println(checkNullValue);
		Optional<String> checkNull=Optional.ofNullable(s[5]);
		checkNull.ofNullable(s[5]);
		System.out.println(checkNull);
		/*
		 * if(checkNullValue.isPresent()) { String val=s[5]; System.out.println(s[5]); }
		 * else { System.out.println("empty"); }
		 */
	}
}
