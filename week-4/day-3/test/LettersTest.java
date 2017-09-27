import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class LettersTest {
    @Test
    public void countLetter() throws Exception {
        Letters harrypotter = new Letters();
        Map<Character, Integer> testmap = new HashMap<Character, Integer>();
        testmap.put('a', 3);
        testmap.put('g', 1);
        testmap.put('c', 2);
        assertEquals(testmap, harrypotter.countLetter("aaagcc"));
    }

}