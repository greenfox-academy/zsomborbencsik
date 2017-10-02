import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RomanNumbers {

    public String convertToRoman(int arabic) {

        StringBuilder ab = new StringBuilder();

        int remaining = arabic;

        List<Integer> values = new ArrayList<>(Arrays.asList(9,5,4));
        List<String> romanSymbols = new ArrayList<>(Arrays.asList("IX", "V", "IV"));

        for (int i = 0; i < values.size(); i++) {
            remaining = convert(remaining, ab, values.get(i), romanSymbols.get(i));
        }

        remaining = convert(remaining, ab, 9, "IX");
        remaining = convert(remaining, ab, 5, "V");
        remaining = convert(remaining, ab, 4, "IV");

        if (remaining >= 5) {
            ab.append("V");
            remaining -= 5;
        }

        if (remaining == 4) {
            return "IV";
        }

        for (int i = 0; i < remaining; i++) {
            ab.append("I");
        }
        return ab.toString();
    }

    private int convert(int remaining, StringBuilder ab, int value, String roman) {
        if (remaining == value) {
            ab.append(roman);
            remaining -= value;
        }
        return remaining;
    }
}
