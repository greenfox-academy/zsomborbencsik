import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {
    @Test
    public void anagramTest() throws Exception {
        Anagram ana = new Anagram();
        String one = "gold";
        String two = "dogl";
        assertEquals(true, ana.anagram(one,two));
    }

}