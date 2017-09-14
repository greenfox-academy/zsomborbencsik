import java.util.Scanner;

public class ParametricAvarage {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        int sum = 0;

        for (int i = 0; i < 10 ; i++) {
            System.out.println("Enter your number: ");
            int user_input = myScan.nextInt();
            sum += user_input;

        }

        System.out.println(sum);





    }
}

// Write a program that asks for a number.
// It would ask this many times to enter an integer,
// if all the integers are entered, it should print the sum and average of these
// integers like:
//
// Sum: 22, Average: 4.4