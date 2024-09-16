package practice;

public class vowelIsPresentInString {
   public static void main(String []args) {
	   String s="xyz";
	  boolean a= s.toLowerCase().matches(".*[aeiou].*");
	  System.out.println(a);
	  System.out.println(vowel(s));
   }
   static boolean vowel(String s) {
	  for(int i=0;i<s.length();i++) {
		  if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
			  return true;
		  }
	  }
	return false;
   }
}
