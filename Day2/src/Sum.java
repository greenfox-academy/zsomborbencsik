import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter numbers to sum: ");
        int user_input = scan.nextInt();

        System.out.println((sum(user_input)));

    }
    public static int sum (int input) {
        for (int i = 0; i < input; i++) {
            System.out.println(i);
        }
        return 0;


    }




}

//  Create the usual class wrapper
//  and main method on your own.

// - Write a function called `sum` that sum all the numbers
//   until the given parameter
