package practice;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String s= sc.nextLine();
    	String s2 =s;
    	StringBuilder rev=new StringBuilder();
    	for(int i=s2.length()-1;i>=0;i--) {
    		rev.append(s2.charAt(i));
    	}
    	if(s.equals(rev.toString())) {
    		System.out.println("palindrome");
    	}
    	else {
    		System.out.println("not");
    	}
    	
    	int n=202,temp=0,rev1=0;
    	int a=n;
    	while(n!=0) {
    		temp=n%10;
    		rev1=rev1*10+ temp;
    		n=n/10;
    	}
    	System.out.println(a);
    	if(a==rev1) {
    		System.out.println("yes");
    	}
    	else {
    		System.out.println("no");
    	}
    }
}
