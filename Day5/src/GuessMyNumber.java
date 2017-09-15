import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.print("Enter the range: ");
        int user_input = myScan.nextInt();
        Random rand = new Random();
        int  n = rand.nextInt(user_input) + 1;
        int lives = 5;
        System.out.println("Number range is between 1 - " + user_input + " Remaining lives: "+lives);
        int guess = myScan.nextInt();

        while (lives != 0 ) {
            System.out.println("Your guess: ");
            user_input = myScan.nextInt();
            guess = user_input;

            if (guess < n) {
                lives = lives - 1;
                System.out.println("Your number is too low. Remaining lives: " + lives);

            }
            else if (guess > n) {
                lives = lives - 1;
                System.out.println("Your number is too high. Remaining lives: " + lives);
            }
            if (guess == n) {
                System.out.println("You won!");

            }
            else if (lives == 0) {
                System.out.println("You lost!");
            }

        }


    }
}
