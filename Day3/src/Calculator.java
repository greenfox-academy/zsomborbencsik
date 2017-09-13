import java.util.Scanner;

public class Calculator {
    public static void main(String... args) {
        int a, b, answer;
        String operator;

        Scanner scan = new Scanner(System.in);

        log("Please type in the expression: ");

        operator = scan.next();
        a = scan.nextInt();
        b = scan.nextInt();

        if (operator.contains("+")) {
            answer = a + b;
            log(""+answer);
        }
        if (operator.contains("-")) {
            answer = a - b;
            log(""+answer);
        }
        if (operator.contains("*")) {
            answer = a * b;
            log(""+answer);
        }
        if (operator.contains("/")) {
            answer = a / b;
            log(""+answer);
        }

    }
    public static void log (String scan) {
        System.out.print(scan);
    }
}

// Create a simple calculator application which reads the parameters from the prompt
// and prints the result to the prompt.
// It should support the following operations:
// +, -, *, /, % and it should support two operands.
// The format of the expressions must be: {operation} {operand} {operand}.
// Examples: "+ 3 3" (the result will be 6) or "* 4 4" (the result will be 16)

// You can use the Scanner class
// It should work like this:

// Start the program
// It prints: "Please type in the expression:"
// Waits for the user input
// Print the result to the prompt
// Exit