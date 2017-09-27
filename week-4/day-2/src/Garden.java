import java.util.Scanner;

public class Garden {
    int flowers;
    int trees;
    int water;

    public Garden(int flowers, int trees, int water) {
        this.flowers = flowers;
        this.trees = trees;
        this.water = water;
    }

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
        Flower flower = new Flower();

        flower1.watering(40);
        System.out.println(flower1.currentWaterLevel);
        flower1.needsWater();



    }
}
