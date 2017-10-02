import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GetIndex {
    public int getIndex(int value, List<Integer> arrays) {
        for (int i = 0; i < arrays.size(); i++) {
            if (arrays.get(i).equals(value)) {
                return i;
            }
        }
        return -1;
    }
    public boolean anagram(String word1, String word2) {
        char[] wordone = word1.replaceAll("[\\s]", "").toCharArray();
        char[] wordtwo = word2.replaceAll("[\\s]", "").toCharArray();
        Arrays.sort(wordone);
        Arrays.sort(wordtwo);
        if (Arrays.equals(wordone, wordtwo)) {
            return true;
        }
        else {
            return false;
        }
    }
}
