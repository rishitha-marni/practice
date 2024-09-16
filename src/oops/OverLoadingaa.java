package oops;

public class OverLoadingaa {
    public static void main(String[] args) {
    	double a=10.5,b=5.0;
    	System.out.println(sum(a,b));
    }
    static int sum(int a, int b) {
    	return a+b;
    }
    static double sum(double a, double b) {
    	return a+b;
    }
}
