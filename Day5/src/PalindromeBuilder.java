public class PalindromeBuilder {
    public static void main(String[] args) {
        String a = "greenfox";
        String b = "zombor";
        System.out.println(palindrome(a));
    }

    static String palindrome (String input1) {
        String temp = input1;
        for (int i = 0; i < input1.length(); i++) {

            temp = temp + input1.charAt((input1.length()-1)-i);
        }


        return temp;
    }
}
