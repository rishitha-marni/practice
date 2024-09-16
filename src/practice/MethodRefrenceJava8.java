package practice;

import java.util.function.BiFunction;
import java.util.function.Supplier;
//using static method refernce
/*public class MethodRefrenceJava8 {
   public static int Add(int a,int b) {
	   return a+b;
   }
	
	public static void main(String[] args) {
		 
		
		BiFunction<Integer, Integer, Integer> addition= MethodRefrenceJava8:: Add;
		int sum=addition.apply(1, 2);
		System.out.println(sum);
			
			
	}
}*/
// using method reference to using inctance of method using object

/*public class MethodRefrenceJava8 {
	public int Add(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {

		MethodRefrenceJava8 mm = new MethodRefrenceJava8();
		BiFunction<Integer, Integer, Integer> addition = mm::Add;
		int sum = addition.apply(1, 2);
		System.out.println(sum);

	}
}*/
 

// method reference for construtor
public class MethodRefrenceJava8 {
	   public  String name;
		
	   public MethodRefrenceJava8() {
		   this.name="rishi";
	   }
		public static void main(String[] args) {
			 
			Supplier<MethodRefrenceJava8> ss= MethodRefrenceJava8::new;
			MethodRefrenceJava8 s=ss.get();
			System.out.println(s.name);
				
				
		}
	}
