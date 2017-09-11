import java.util.Scanner;

public class PartyIndicator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Boys: ");

        System.out.println("Girls: ");

        int boys = scan.nextInt();
        int girls = scan.nextInt();
        boolean ratio = (boys == girls) && ((boys + girls) >= 20);
        boolean ratio2 = ((boys + girls) >= 20) && (boys > girls);

        if (ratio) {
            System.out.println("Quite a cool party");;
        }

        if (ratio2) {
            System.out.println("Avarage Party");
        }
        // Write a program that asks for two numbers
        // Thw first number represents the number of girls that comes to a party, the
        // second the boys
        // It should print: The party is exellent!
        // If the the number of girls and boys are equal and there are more people coming than 20
        //
        // It should print: Quite cool party!
        // It there are more than 20 people coming but the girl - boy ratio is not 1-1
        //
        // It should print: Average party...
        // If there are less people coming than 20
        //
        // It should print: Sausage party
        // If no girls are coming, regardless the count of the people
            }
}
