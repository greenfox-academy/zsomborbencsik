import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Dominoes implements Printable {
    private final int[] values;

    public Dominoes(int valueA, int valueB) {
        this.values = new int[]{valueA, valueB};
    }
    @Override
    public void printAllFields() {
        System.out.println(Arrays.toString(this.values));
    }

    public static void main(String[] args) {
        List<Dominoes> dominoes = initializeDominoes();
        // You have the list of Dominoes
        // Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
        // eg: [2, 4], [4, 3], [3, 5] ...
        for(Dominoes d : dominoes) {
            d.printAllFields();
        }
    }

    static List<Dominoes> initializeDominoes() {
        List<Dominoes> dominoes = new ArrayList<>();
        dominoes.add(new Dominoes(5, 2));
        dominoes.add(new Dominoes(4, 6));
        dominoes.add(new Dominoes(1, 5));
        dominoes.add(new Dominoes(6, 7));
        dominoes.add(new Dominoes(2, 4));
        dominoes.add(new Dominoes(7, 1));
        return dominoes;
    }


}