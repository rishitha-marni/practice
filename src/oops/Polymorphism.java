package oops;

public class Polymorphism {
  public static void main(String[] args) {
	  area ss=new area();
	  System.out.println(ss.getArea(2, 2));
	  System.out.println(ss.getArea(2.2, 2.2));
	   
  }
}
//method overloading - compile time polymorphism
class area{
	public int getArea(int a,int b) {
		return a*b;
	}
	
	public double getArea(double a,double b) {
		return a*b;
	}
}
