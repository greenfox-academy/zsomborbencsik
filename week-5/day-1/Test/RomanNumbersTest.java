import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RomanNumbersTest {

    RomanNumbers romanNumbers;

    @Before
    public void setUp() {
        if (romanNumbers == null) {
            romanNumbers = new RomanNumbers();
        }
    }
    @Test
    public void convertToRoman() throws Exception {
        RomanNumbers romanNumbers = new RomanNumbers();
        assertEquals("I", romanNumbers.convertToRoman(1));
    }
    @Test
    public void convertToRoman2() throws Exception {
        RomanNumbers romanNumbers = new RomanNumbers();
        assertEquals("II", romanNumbers.convertToRoman(2));
    }
    @Test
    public void convertToRoman3() throws Exception {
        RomanNumbers romanNumbers = new RomanNumbers();
        assertEquals("III", romanNumbers.convertToRoman(3));
    }
    @Test
    public void convertToRoman4() throws Exception {
        RomanNumbers romanNumbers = new RomanNumbers();
        assertEquals("IV", romanNumbers.convertToRoman(4));
    }
    @Test
    public void convertToRoman5() throws Exception {
        RomanNumbers romanNumbers = new RomanNumbers();
        assertEquals("V", romanNumbers.convertToRoman(5));
    }
    @Test
    public void convertToRoman6() throws Exception {
        RomanNumbers romanNumbers = new RomanNumbers();
        assertEquals("VI", romanNumbers.convertToRoman(6));
    }
    @Test
    public void convertToRoman7() throws Exception {
        RomanNumbers romanNumbers = new RomanNumbers();
        assertEquals("VII", romanNumbers.convertToRoman(7));
    }
    @Test
    public void convertToRoman8() throws Exception {
        RomanNumbers romanNumbers = new RomanNumbers();
        assertEquals("VIII", romanNumbers.convertToRoman(8));
        assertEquals("IX", romanNumbers.convertToRoman(9));
    }


}