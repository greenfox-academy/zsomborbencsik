import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SumTest {
    @Test
    public void sumTest() throws Exception {
        Sum summing = new Sum();
        ArrayList<Integer> testlist = new ArrayList<>(Arrays.asList(3,5,2,7));
        assertEquals(17,summing.sum(testlist));
    }
    @Test
    public void sumTest2() throws Exception {
        Sum summing = new Sum();
        ArrayList<Integer> testlist2 = new ArrayList<>(Arrays.asList(null));
        assertEquals(null,summing.sum(testlist2));
    }


}