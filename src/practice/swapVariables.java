package practice;

import java.util.Scanner;

public class swapVariables {
	 public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 int a=sc.nextInt();
		 int b=sc.nextInt();
		 int temp;
		 temp=a;
		 a=b;
		 b=temp;
		 System.out.println(a+ " "+b);
		 
		 
		 a=a+b;//4+1=5
		 b=a-b;//5-1=4
		 a=a-b;//5-4=1
		 System.out.println(a+ " "+b);
	 }
}
