import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in)  ;
        System.out.println("Enter mile to convert to km: " );
        int user_input = scan.nextInt();

        System.out.println(user_input * 1.609344);
    }
}