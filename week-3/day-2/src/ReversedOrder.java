import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReversedOrder {

    public static void main(String[] args) {
        List<String> goodorder = new ArrayList<>();
        try {
            Path path = Paths.get("reversed-order.txt");
            List<String> myList = Files.readAllLines(path);
            for (int i = myList.size()-1; i > 0 ; i--) {
                goodorder.add(myList.get(i));
            }
            Files.write(path, goodorder);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(goodorder);




    }
}