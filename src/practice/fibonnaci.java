package practice;

import java.util.ArrayList;
import java.util.Arrays;

public class fibonnaci {
    public static void main(String[] args) {
    	int a=0,b=1,temp=0,c=0;
    	int length=10,i=0;
    	System.out.print(a +" "+b);
    	while(i<length) {
    		c=a+b;
    		System.out.print(" "+c);
    		a=b;
    		b=c;
    		i++;
    	}
    	
    	//only odd
    	System.err.println("----------------");
    	ArrayList<Integer> odd= new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
    	odd.stream().filter(n->n%2!=0).forEach(System.out::println);
        
    }
}
