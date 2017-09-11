import java.util.Scanner;

public class OneTwoALot {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int user_input = scan.nextInt();

        boolean a = user_input <= 0;
        boolean b = user_input > 2;

        if (a) {
            System.out.println("Not enough");
        }
        if (b) {
            System.out.println("A lot");
        }

        else {
            System.out.println(user_input);
        }

        // Write a program that reads a number form the standard input,
        // If the number is zero or smaller it should print: Not enough
        // If the number is one it should print: One
        // If the number is two it should print: Two
        // If the number is more than two it should print: A lot
    }
}
