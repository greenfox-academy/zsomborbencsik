import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter number of chickens: ");

        int chicken = scan1.nextInt();
        System.out.println("Enter number of pigs: ");

        int pigs = scan1.nextInt();
        System.out.println("You have: " + ((chicken*2) + (pigs*4)) + " animal legs.");
    }
}