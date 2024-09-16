package practice;

import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class whitespaceremove {
	public static void main(String[] args) {
		String s="i am rishitha";
		String str=s.replace(" ", "");
		/*
		 * StringBuilder sc=new StringBuilder(); for(int i=0;i<s.length();i++) {
		 * if(s.charAt(i)!=' ') { sc.append(s.charAt(i));} }
		 */
		System.out.println(str);
		int count=0;
		Map<Character, Long> couent=s.chars().mapToObj(c-> Character.toLowerCase((char)c))
		.collect(Collectors.groupingBy(c-> c,Collectors.counting()));
		System.out.println(couent);
		
		
	}
	
}
