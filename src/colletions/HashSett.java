package colletions;

import java.util.HashSet;

public class HashSett {
  
	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<>();
		hs.add("ria");
		hs.add("rishi");
		hs.add("ria");
		hs.remove("ria");
		System.out.println(hs);
	}
}
