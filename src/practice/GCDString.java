package practice;

public class GCDString {

    public static void main(String[] args) {
        // Test cases
        System.out.println(gcdOfStrings("ABCABC", "ABC")); // Output: "ABC"
        System.out.println(gcdOfStrings("ABABAB", "ABAB")); // Output: "AB"
        System.out.println(gcdOfStrings("LEET", "CODE")); // Output: ""
    }

    public static String gcdOfStrings(String str1, String str2) {
        // Check if str1 + str2 is the same as str2 + str1
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        // Find the GCD of the lengths of str1 and str2
        int gcdLength = gcd(str1.length(), str2.length());
        return str1.substring(0, gcdLength);
    }

    // Helper method to compute the GCD of two numbers
    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

