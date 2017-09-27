import org.junit.Test;

import static org.junit.Assert.*;

public class SharpieTest {
    @Test
    public void use() throws Exception {
        Sharpie nicesharpie = new Sharpie();
        assertTrue(80 == nicesharpie.use());
    }

    @Test
    public void countUsable() throws Exception {
        Sharpie nicesharpie2 = new Sharpie();
        nicesharpie2.inkAmount = 0;
        assertEquals(null,nicesharpie2.countUsable());
    }

    @Test
    public void removeTrash() throws Exception {
        Sharpie nicesharpie3 = new Sharpie();
        assertEquals(null,nicesharpie3.removeTrash());
    }

    @Test
    public void main() throws Exception {
    }

}