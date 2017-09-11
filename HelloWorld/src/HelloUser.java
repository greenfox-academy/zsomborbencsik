
import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter your name: ");
        String user_name = scan.next();
        System.out.println("Welcome " + user_name );
    }
}