import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GetIndex {
    public int getIndex(int value, List<Integer> arrays) {
        for (int i = 0; i < arrays.size(); i++) {
            if (arrays.get(i).equals(value)) {
                return i;
            }
        }
        return -1;
    }
    public boolean
}
