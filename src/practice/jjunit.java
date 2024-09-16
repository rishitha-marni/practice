package practice;

public class jjunit {
	
	public String publicMethod(String input) {
        return myPrivateMethod(input);
    }

    // Private method that you want to test
    private String myPrivateMethod(String input) {
        return "Processed: " + input;
    }
}


