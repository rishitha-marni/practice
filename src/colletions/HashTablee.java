package colletions;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTablee {
  public static void main(String[] args) {
	  Hashtable<Integer, String> tab= new Hashtable<Integer, String>();
	  tab.put(1, "a");
	  tab.put(2, "b");
	  System.out.println(tab);
	  Enumeration ee=tab.elements();
	  while(ee.hasMoreElements()) {
		  System.out.println(ee.nextElement());
	  }
  }
}
