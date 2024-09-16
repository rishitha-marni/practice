package practice;

public class StringComparision {
     public static void main(String[] args) {
    	 String str1 = new String("Hello ScholarHat");
         String str2 = new String("Hello ScholarHat");

         String s="hi";
         String s1="hi";
         // Comparing references of str1 and str2
         System.out.println(str1 == str2);
         System.out.println(s==s1);
         
         cons name=new cons();
         name.dis();
     }
}
     class cons{
    	 
    	 int a,b;

		public cons(int a, int b) {
			super();
			this.a = a;
			this.b = b;
		}
    	 
		public cons() {
			this(0,0);
			System.out.println(a+b);
		}
		
		public void dis() {
			System.out.println(a+b);
		}
     }

