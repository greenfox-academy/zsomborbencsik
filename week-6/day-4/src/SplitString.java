import java.util.Arrays;

public class SplitString {

    public static String[] splitter(String word, int splitplace) {
        String sub = null;
        try {
            sub = word.substring(0, splitplace);
            String remainder = word.substring(splitplace);
            String[] splitWord = {sub,remainder};
            return splitWord;
        } catch (Exception e) {
            System.out.println("OutOfBoundException");;
        }
        return null;

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(splitter("marilove", 4)));
    }
}
