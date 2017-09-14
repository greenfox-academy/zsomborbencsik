import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int user_input = myScanner.nextInt();
        String repeated = "*";
        String star = "*";


        for (int i = 1; i < user_input+1; i++) {
            repeated = new String(new char[i]).replace("\0", star);



            System.out.println(repeated);

        }


    }
}

// Write a program that reads a number from the standard input, then draws a
// triangle like this:
//
// *
// **
// ***
// ****
//
// The triangle should have as many lines as the number was