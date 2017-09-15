import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String a = "dog";
        String b = "green";
        String c = "god";
        String d = "fox";
        System.out.println(anagramtwo(a,c));
    }

    static boolean anagram (String input1, String input2) {
        char[] word1 = input1.replaceAll("[\\s]", "").toCharArray();
        char[] word2 = input2.replaceAll("[\\s]", "").toCharArray();
        Arrays.sort(word1);
        Arrays.sort(word2);
        return Arrays.equals(word1, word2);
    }

    static boolean anagramtwo (String input3, String input4) {
        if (input3.length() != input4.length()) {
            return false;
        }
        else {
            for (int i = 0; i <input3.length(); i++) {
                if (input3.charAt(i) == input4.charAt(input3.length()-1)){
                    return true;
                }
            }
        }
        return false;
    }

}
