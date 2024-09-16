package streams;

public class FunctionalInterfaceC {
   
	public static void main(String[] args) {
		Calculation addition= (a,b) -> a+b;
		Calculation sub=(a,b) -> a-b;
		Calculation mul=(a,b) -> a*b;
		Calculation div=(a,b) ->{
		if(b==0) {
			throw new ArithmeticException();
			}
			return a/b;
		};
		int x=2,y=0;
		System.out.println(addition.Operate(x, y));
		System.out.println(sub.Operate(x, y));
		System.out.println(mul.Operate(x, y));
		System.out.println(div.Operate(x, y));
	}
}

@FunctionalInterface
interface Calculation {
	int Operate(int a,int b);
}
