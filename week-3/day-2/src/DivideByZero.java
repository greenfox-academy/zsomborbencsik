import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int user_number = myScan.nextInt();
        System.out.println(number(user_number));


    }

    static int number (int input) {
        int divided = 10;
        int result = 0;
        try {
            result = divided / input;
            return result;

        } catch (ArithmeticException e) {
            System.out.println("Can't be divided by zero!");
        }
        return result;



    }
}


// create a function that takes a number
// divides ten with it,
// and prints the result.
// it should print "fail" if the parameter is 0