import java.util.Arrays;

public class SplitString {

    public static String[] splitter(String word, int splitplace) {
        String sub = word.substring(0, splitplace);
        String remainder = word.substring(splitplace);
        String[] splitWord = {sub,remainder};
        return splitWord;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(splitter("marilove", 4)));
    }
}
