package oops;

public class overriding {
    public static void main(String[] args) {
    	ladoo ladoo=new ladoo();
    	 ladoo.kajja();
    }
}
     class sweet{
    	 void kajja() {
    	 System.out.println("kajja");
     }
     }
      class ladoo extends sweet {
    	  @Override
    	  void kajja() {
    		  System.out.println("biscut");
    	  }
		
    	  
    	  
     }

