package practice;

import java.util.Base64;

public class EncodeAndDecode {
    public static void main(String[] args) {
    	Base64.Encoder b64= Base64.getUrlEncoder();
    	String str= b64.encodeToString("https://www.javatpoint.com/java-base64-encode-decode".getBytes());
        System.out.println(str);
    	Base64.Decoder d=Base64.getUrlDecoder();
    	String sr=new String(d.decode(str));
    	System.out.println( sr);
    }
}
