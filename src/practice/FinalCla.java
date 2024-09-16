package practice;

//final // The class is not final, so it can be inherited
public class FinalCla {  // Note: Naming conventions in Java suggest starting class names with an uppercase letter.
    
    public static void main(String[] args) {
        int a = 5, c = 5;
        final int b = 5;
        a++; 
        // b++;  // Compilation error: Cannot modify a final variable
         //b = 10;  // Compilation error: Cannot reassign a final variable
        
        System.out.println(sum(a, c)); // Calling static sum method
    }

    // Static method because it's being called in the static context (main method)
    static int sum(int a, int b) {
        return a + b;
    }
    
    // The class is not final, so it can be extended
    class Ab extends FinalCla { 
        // sum method from FinalCla cannot be overridden if declared final
       // final int sum(int a, int b) { // This method cannot be overridden in subclasses
       //     return a + b;
        //}
    }
}
