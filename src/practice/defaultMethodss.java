package practice;

interface apple{
	default void fruit(){
		System.out.println("hi");
	}
}

interface bananna {
	
	default void fruit(){
		System.out.println("hik");
	}
}
 class fun implements apple,bananna {
   @Override
public void fruit(){
		System.out.println("hip");
	}
 }
 public class defaultMethodss{  
   public static void main(String[] args) {
	 fun nn= new fun();
	 nn.fruit();
}
}

