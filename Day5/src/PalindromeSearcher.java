public class PalindromeSearcher {
    public static void main(String[] args) {
        String a = "dog goat dad duck doodle never";
        String b = "apple";
        String c = "racecar";
        System.out.println(palindromes(a));
    }
    static String palindromes (String input1) {
        String temp = input1;
        if (input1.length() <  3) {
            return null;
        }
        else {
            for (int i = 0; i < input1.length(); i++) {
                for (int j = i+1; j > i; j++) {
                    for (int k = j+1; k > j; k++) {
                        if (i == k) {
                            temp += input1.substring(i, k);
                        }
                    }
                }

            }
            return temp;
        }
    }
}
