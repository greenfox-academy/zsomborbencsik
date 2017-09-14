import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your guess: ");

        int user_input = scan.nextInt();
        int myNumber = 8;

        if (user_input < myNumber) {
            System.out.println("The stored number is higher");
        }

        if (user_input > myNumber) {
            System.out.println("The stried number is lower");
        }

        if (user_input == myNumber) {
            System.out.println("You found the number: " + myNumber);
        }

    }
}


// Write a program that stores a number, and the user has to figure it out.
// The user can input guesses, after each guess the program would tell one
// of the following:
//
// The stored number is higher
// The stried number is lower
// You found the number: 8