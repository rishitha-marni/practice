package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class duplicateCharCount {
   public static void main(String[] args) {
	   String s="rishi";
	   HashMap<Character, Integer> map=new HashMap<>();
	   s.toLowerCase();
	   for(char c:s.toCharArray()) {
		   map.put(c, map.getOrDefault(c, 0)+1);
	   }
	   for(Map.Entry<Character, Integer> entry : map.entrySet()) {
		   if(entry.getValue()>1) {
			   System.out.println(entry.getKey()+ "  count: "+entry.getValue());
		   }
	   }
	   
	   
	   
	   
	   int [] c=new int[256];
	   for(int i=0;i<s.length();i++) {
		    c[s.charAt(i)]++;
	   }
	   
	   for(int i=0;i<c.length;i++) {
		   if(c[i]>1) {
			   System.out.println((char)i+" count:"+c[i]);
		   }
	   }
   }
}
