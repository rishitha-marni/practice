package practice;

public class FinallyCla {
    public static void main(String[] args) {
    	int a=10,b=0;
    	try {
    		int c=a/b;
    		System.out.println(c);
    	}
    	catch(ArithmeticException e){
    		System.out.println( "error"+e);
    		return;
    	}
    	finally {
			System.out.println("finally block");
		}
    	
    
}}
