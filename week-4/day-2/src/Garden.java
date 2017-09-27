import java.util.Scanner;

public class Garden {
    int flowers;
    int trees;
    int water;

    public static void main(String[] args) {
        Flower flower1 = new Flower();
        flower1.plantColor = "yellow";
        Flower flower2 = new Flower();
        flower2.plantColor = "blue";
        Tree tree1 = new Tree();
        tree1.plantColor = "purple";
        Tree tree2 = new Tree();
        tree2.plantColor = "orange";

        Plants plant = new Plants();

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter water amount: ");
        int user_input = myScanner.nextInt();
        plant.wateramount = user_input;
        System.out.println(flower1.waterNeed);



    }
}
