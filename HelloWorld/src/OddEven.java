import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number: ");
        int user_input_number = scan.nextInt();

        boolean even = user_input_number%2 == 0;

        if (even) {
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
    }
}
