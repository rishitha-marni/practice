package practice;

interface a{
	//abstract void apple();
	
	default void parents() {
		System.out.println("parents");
	}
}

 class abg implements a{

	@Override
	public void parents() {
		System.out.println("pa-rents");
	}
	
}
public class defaultMethodsss {
  public static void main(String[] args) {
	  abg bb=new abg();
	  bb.parents();
  }
}
