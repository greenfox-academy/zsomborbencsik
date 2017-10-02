import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterTest {

    @Test
    public void converter2() throws Exception {
        Converter word = new Converter();
        assertEquals("five USD",word.converter(5) );
    }

    @Test
    public void converter3() throws Exception {
        Converter word = new Converter();
        assertEquals("thirteen USD",word.converter(13) );
    }

    @Test
    public void converter4() throws Exception {
        Converter word = new Converter();
        assertEquals("twentyfour USD",word.converter(24) );
    }
    @Test
    public void converter5() throws Exception {
        Converter word = new Converter();
        assertEquals("twenty USD",word.converter(20) );
    }
    @Test
    public void converter6() throws Exception {
        Converter word = new Converter();
        assertEquals("one hundred ten USD",word.converter(110) );
    }

    @Test
    public void converter7() throws Exception {
        Converter word = new Converter();
        assertEquals("four hundred twenty USD",word.converter(420) );
    }

    @Test
    public void converter8() throws Exception {
        Converter word = new Converter();
        assertEquals("three hundred ninetynine USD",word.converter(399) );
    }
}