package practice;

import java.util.function.BiFunction;

class addi{
	 
	public static int summ(int a,int b) {
		return a+b;
	}
}
public class MethodRefrencess {
    public static void main(String[] args) {
    	BiFunction<Integer, Integer, Integer> kk= addi ::summ;
    	System.out.println(kk.apply(10, 20));
    	
    }
}
