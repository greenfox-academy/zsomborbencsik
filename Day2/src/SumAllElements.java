import com.sun.org.apache.xpath.internal.SourceTree;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SumAllElements {
    public static void main(String[] args) {
        int[] ai = {3, 4, 5, 6, 7};

        for (int i = 0; i < ai.length; i++) {
            int sum = 0 + ai[i];
            ai = sum;

        }
        System.out.println(Arrays.toString(ai));
    }
}


// - Create an array variable named `ai`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Print the sum of the elements in `ai`