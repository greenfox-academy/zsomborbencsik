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
    @Test
    public void anagram() throws Exception {
        GetIndex index = new GetIndex();
        assertEquals(true, index.anagram("bull", "lulb"));
    }
    @Test
    public void anagram1() throws Exception {
        GetIndex index = new GetIndex();
        assertEquals(true, index.anagram("bul", "lulb"));
    }
    @Test
    public void anagram2() throws Exception {
        GetIndex index = new GetIndex();
        assertEquals(true, index.anagram("b", "l"));
    }
    @Test
    public void anagram3() throws Exception {
        GetIndex index = new GetIndex();
        assertEquals(true, index.anagram("b", "b"));
    }
    @Test
    public void anagram4() throws Exception {
        GetIndex index = new GetIndex();
        assertEquals(true, index.anagram("bul1", "lulb3"));
    }

}
