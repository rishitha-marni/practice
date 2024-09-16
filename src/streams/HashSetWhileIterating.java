package streams;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetWhileIterating {
    public static void main(String[] args) {
    	HashSet<Integer> hh=new HashSet<>();
    	HashSet<Integer> Newhh=new HashSet<>();		
    	hh.add(1);
    	hh.add(2);
    	Iterator<Integer> ite= hh.iterator();
    	while(ite.hasNext()) {
    		System.out.println(ite.next());
    		
    		if(ite.next()==2) {
    		Newhh.add(5);}
    	}
    	hh.addAll(Newhh);
    	System.out.println(hh);
    }
}
