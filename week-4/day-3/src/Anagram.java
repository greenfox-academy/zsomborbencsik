import java.util.Arrays;

public class Anagram {
    public boolean anagram (String word1, String word2) {
        char[] wordone = word1.replaceAll("[\\s]", "").toCharArray();
        char[] wordtwo = word2.replaceAll("[\\s]", "").toCharArray();
        Arrays.sort(wordone);
        Arrays.sort(wordtwo);
        return Arrays.equals(wordone, wordtwo);
    }

}
