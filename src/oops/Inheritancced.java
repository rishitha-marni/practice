package oops;

public class Inheritancced {
   public static void main(String [] args) {
	   math mm=new math();
	   mm.sum(1, 2);
   }
   
}

class addition{
	public void sum(int a,int b) {
		System.out.println(a+b);
	}
}

class math extends addition{
	
	@Override
	public void sum(int a,int b) {
		System.out.println(a+b);
	}
}
