import java.util.*;

public class InList{
    public static void main(String... args){
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(4, 8, 12, 16));

        if (list.containsAll(list2)) {
            System.out.println("true");
        }

        // Check if list contains all of the following elements: 4,8,12,16
        // Print "true" if it contains all, otherwise print "false"
        // Can you do both the different approaches you tried in the previous one?

    }
}