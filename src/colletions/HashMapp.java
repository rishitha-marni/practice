package colletions;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapp {
	public static void main(String[] args) {
		Map<Integer, String> map= new HashMap<Integer,String>();
		map.put(1, "ria");
		map.put(2,"rishi");
		map.put(3, "ria");
		System.out.println(map);
		/*
		 * Set set=map.entrySet(); 
		 * Iterator it= set.iterator(); 
		 * while(it.hasNext()) {
		 * Map.Entry entry= (Map.Entry)it.next();
		 * System.out.println(entry.getKey()+"  "+entry.getValue());
		 * System.out.println(it.next()); }
		 */
		map.entrySet().stream()
		.sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
		.forEach(System.out::println);
	}
}
