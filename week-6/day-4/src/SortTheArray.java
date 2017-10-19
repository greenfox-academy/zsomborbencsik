import java.util.Arrays;
import java.util.Collections;

public class SortTheArray {

    public static <T extends Number> void sorter (T[] toBeSorted) {
        Arrays.sort(toBeSorted, Collections.reverseOrder());
    }
    
    public static void main(String[] args) {
        Integer[] toSort = {1,2,5,3,4};
        sorter(toSort);
        System.out.println(Arrays.toString(toSort));
    }
}
