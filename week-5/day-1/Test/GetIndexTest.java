import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class GetIndexTest {
    @Test
    public void getIndexTest() throws Exception {
        GetIndex index = new GetIndex();
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9));
        assertEquals(-1, index.getIndex(2,list));
    }
    @Test
    public void getIndexTest1() throws Exception {
        GetIndex index = new GetIndex();
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9));
        assertEquals(3, index.getIndex(7,list));
    }
}