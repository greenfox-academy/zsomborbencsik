import java.util.Arrays;
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Check if Armstrong Number: ");
        int usernumber = myScan.nextInt();

        if (armstrong(usernumber)) {
            System.out.println("Your number is an Armstrong number");
        }
        else {
            System.out.println("Your number is not an Armstrong number");
        }



    }
    static boolean armstrong (int input) {
        String number = Integer.toString(input);
        int[] digits1 = new int[number.length()];
        int all = 0;
        for (int i = 0; i < digits1.length; i++) {
            all = (int) (all + Math.pow(Character.getNumericValue(number.charAt(i)), digits1.length));
            }
        System.out.println(all);
        if (all == input) {
            return true;
        }
        else {
            return false;
        }

    }

}
