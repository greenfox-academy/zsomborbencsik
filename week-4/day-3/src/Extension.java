import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by aze on 2017.04.04..
 */
public class Extension {
    int add(int a, int b) {
        return a + b;
    }

    int maxOfThree(int a, int b, int c) {
        if (a > b && a > c) {
                return a;
        } else if (b > c && b > a) {
            return b;
        } else if (c > b && c > a) {
            return c;
        } else {
            return 0;
        }

    }

    double median(List<Integer> pool) {
        Collections.sort(pool);
        System.out.println(pool);
        double median = 0;
        if ((pool.size() % 2) != 0) {
            median =(double) pool.get(pool.size() / 2);
        } else {
            median = (((double)pool.get(pool.size() / 2)) + ((double)pool.get((pool.size() / 2) - 1))) / 2;
        }
        System.out.println(median);
        return median;
    }

    public static void main(String[] args) {
        Extension newex = new Extension();

        System.out.println(newex.translate("alma"));
    }

    boolean isVowel(char c) {
        if (c!='a' && c!='e' && c!='i' && c!='o' && c!='u') {
            return false;
        } else {
            return true;
        }
    }

    String translate(String hungarian) {
        String teve = hungarian;
        int length = teve.length();
        for (int i = 0; i < length - 1; i++) {
            char c = teve.charAt(i);
            if (isVowel(c)) {
                teve = String.join(c + "v" + c, teve.split(""+c));
                i+=2;
                length+=2;
            }
        }
        return teve;
    }
}