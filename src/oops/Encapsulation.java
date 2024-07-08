package oops;

public class Encapsulation {

	public static void main(String [] args) {
		Person pp= new Person();
		pp.setName("rishi");
		pp.setAge(23);
		System.out.println(pp.getName()+" "+pp.getAge());
	}
	
}

 class Person{
	private String Name;
	private int age;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
