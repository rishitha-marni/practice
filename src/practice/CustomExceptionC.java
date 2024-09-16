package practice;

public class CustomExceptionC {
   public static void main(String[] args) throws numberGreaterThanTen {
	   try {
	   int n=11;
	   if(n>10) {
		   throw new numberGreaterThanTen("num greter then 10");
	   }
	   else {
		   System.out.println("success");
	   }
	   }
	   catch(numberGreaterThanTen e) {
		   System.out.println(e);
	   }
   }
}

class numberGreaterThanTen extends Exception{
	public numberGreaterThanTen(String message) {
		super(message);
	}
}
 