package practice;

public class stringgg {
    
	public static void main(String[] args) {
		String s1= "rishi";
		StringBuffer ss= new StringBuffer("rishi");
		StringBuilder sss= new StringBuilder("rishi");
		s1.concat("good");
		System.out.println(s1);
		
		ss.append("good");
		System.out.println(ss);
		sss.append("good");
		System.out.println(sss);
	}
}
