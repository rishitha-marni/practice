package oops;
//overriding
public class RunTimePolymorphysim {
   public static void main(String[] args) {
	cat cc= new cat();
	cc.bark();
   }
}

class dog{
	public void bark() {
		System.out.println("bow-bow");
	}
}

class cat extends dog{
	public void bark() {
		System.out.println("meow-meow");
	}

	@Override
	public String toString() {
		return super.toString()+"cat [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
}
