package oops;

public class InnerClass {
   public static void main(String[] args) {
	   
	   outer ou= new outer();
	   outer.inner in= ou.new inner();
	   System.err.println(ou.x);
	   System.out.println(in.y);
   }
}

class outer{
	
	int x=20;
	class inner{
		int y=30;
	}
}
