import com.sun.java.browser.plugin2.DOM;

import java.util.ArrayList;
import java.util.List;

public class Dominoes {
    public static void main(String[] args) {
        List<Domino> dominoes = initializeDominoes();
        List<Domino> dominoes2 = new ArrayList<>();
        dominoes2.add(0,dominoes.get(0));

        // You have the list of Dominoes
        // Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
        // eg: [2, 4], [4, 3], [3, 5] ...
        while (dominoes.size() > 0) {

            for (int i = 0; i < dominoes.size(); i++) {
                if (dominoes2.get(dominoes2.size() -1).getValues()[1] == dominoes.get(i).getValues()[0]) {
                    dominoes2.add(dominoes.get(i));
                    dominoes.remove(i);
                }

            }
        }

        System.out.println(dominoes2);
    }

    static List<Domino> initializeDominoes() {
        List<Domino> dominoes = new ArrayList<>();
        dominoes.add(new Domino(5, 2));
        dominoes.add(new Domino(4, 6));
        dominoes.add(new Domino(1, 5));
        dominoes.add(new Domino(6, 7));
        dominoes.add(new Domino(2, 4));
        dominoes.add(new Domino(7, 1));
        return dominoes;
    }
}