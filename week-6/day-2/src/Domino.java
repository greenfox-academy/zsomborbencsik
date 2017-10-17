import java.lang.Comparable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Domino implements Comparable<Domino> {
    private final int[] values;


    public Domino(int valueA, int valueB) {
        this.values = new int[]{valueA, valueB};
    }
    @Override
    public int compareTo(Domino o) {
        if (getValues()[0] > o.getValues()[0]) {
            return 1;
        } else if (getValues()[0] < o.getValues()[0]) {
            return -1;
        } else {
            return 0;
        }
    }

    public int[] getValues() {
        return values;
    }

    @Override
    public String toString() {
        return "[" + values[0] + ", " + values[1] + "]";
    }

    public static void main(String[] args) {
        List<Domino> dominoes = new ArrayList<>();
        dominoes.add(new Domino(5, 2));
        dominoes.add(new Domino(4, 6));
        dominoes.add(new Domino(1, 5));
        dominoes.add(new Domino(6, 7));
        dominoes.add(new Domino(2, 4));
        dominoes.add(new Domino(7, 1));
        Collections.sort(dominoes);
        System.out.println(dominoes);
    }


}