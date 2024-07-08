package oops;

public class Inheritance {
   public static void main(String[] args) {
	   Rectangle mb = new Rectangle(2.0,2.0);
       double area=mb.getArea();
       System.out.println(area);
   }
}

class Shape   {
	
    public double getArea() {
    	return 0.0;
    }
}

class Rectangle  extends Shape {
	private double b;
	private double h;
	
	
    public Rectangle(double b, double h) {
		super();
		this.b = b;
		this.h = h;
	}


	@Override
    public double getArea() {
    	return b*h;
    }
	

    
   
}