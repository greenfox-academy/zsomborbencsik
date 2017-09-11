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
    }
}
