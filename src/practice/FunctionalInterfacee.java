package practice;

@FunctionalInterface
interface calculator{
	int cal(int a,int b);
}

public class FunctionalInterfacee {
   public static void main(String[] args) {
	 calculator add=(a,b)->a+b;
	 calculator mul=(a,b)->a*b;
	 
	 int sum=add.cal(2,3);
	 int pro=mul.cal(2, 3);
	 System.out.println(sum+"  "+pro);
   }
} 
