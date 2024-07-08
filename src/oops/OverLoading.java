package oops;

import java.util.Scanner;

public class OverLoading {
 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a= in.nextInt();
		int b=in.nextInt();
		int c=in.nextInt();
		System.out.println(sum(a,b));
		System.out.println(sum(1.1,2.2,3.3));
	}

	private static double sum(double a, double b, double c) {
		return a+b+c;
	}

	private static int sum(int a, int b) {
		return a+b;
	}
}
