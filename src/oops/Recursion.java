package oops;

import java.util.Scanner;

public class Recursion {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int len=sc.nextInt();
		int n=sum(len);
		System.out.println(n);
	}

	private static int sum(int len) {
		if(len>0) {
			return len+sum(len-1);
		}
		else {
			return 0;
		}
	}
}
