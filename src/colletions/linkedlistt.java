package colletions;

import java.util.Iterator;
import java.util.LinkedList;

public class linkedlistt {
  public static void main(String[] args) {
	  LinkedList<Integer> ll=new LinkedList<>();
	  ll.add(1);
	  System.out.println(ll);
	  
	  ll.add(0, 0);
	  System.out.println(ll);
	  Iterator<Integer> it=ll.iterator();
	  while(it.hasNext()) {
		  System.out.println(it.next());
	  }
	  
	  LinkedList<Integer> l1=new  LinkedList<>();
	  l1.add(3);
	  
	  ll.addAll(2, l1);
	  System.out.println(ll);
	  ll.addLast(4);
	  ll.addFirst(-1);
	  System.out.println(ll);
  }
}
