import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int user_input = myScanner.nextInt();
        int space = 0;

        for (int i = 1; i < user_input-1; i++) {
            for (int k = user_input-2; k > i; k--) {
                System.out.print(" ");
            }

            for (int j = 1; j < i*2; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = 1; i < user_input-2 ; i++) {
            for (int j = i; j < user_input-3; j++) {
                System.out.print(" ");
            }
            for (int k = user_input-1; k > 1; k--) {
                System.out.print("*");
            }
            System.out.println();

        }






    }
}

// Write a program that reads a number from the standard input, then draws a
// diamond like this:
//
//
//    *
//   ***
//  *****
// *******
//  *****
//   ***
//    *
//
// The diamond should have as many lines as the number was