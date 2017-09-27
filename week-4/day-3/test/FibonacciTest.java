import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {
    @Test
    public void dothefibo() throws Exception {
        Fibonacci testing = new Fibonacci();
        assertEquals(8, testing.dothefibo(6));
    }

}