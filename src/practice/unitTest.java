package practice;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Method;

import org.junit.jupiter.api.Test;

class unitTest {
	
	

	@Test
	void test() throws Exception, RuntimeException {
		jjunit jj= new jjunit();
		Method privateM=jj.getClass().getDeclaredMethod("myPrivateMethod", String.class);
		privateM.setAccessible(true);
		String result= (String)privateM.invoke(jj, "input");
		assertEquals("Processed: input", result);
	}

}
