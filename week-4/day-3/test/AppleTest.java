import org.junit.Test;

import static org.junit.Assert.*;

public class AppleTest {
    @Test
    public void getAppleTest() throws Exception {
        Apple test = new Apple();
        assertEquals("apple", test.getApple());
    }

}