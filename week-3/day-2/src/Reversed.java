import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Reversed {

    public static void main(String[] args) {
        try {
            for (String reversed : Files.readAllLines(Paths.get("reversed-lines.txt"))) {

                String straight = "";


                for (int i = reversed.length() - 1; i > 0; i--) {
                    straight += reversed.charAt(i);
                }
                System.out.println(straight);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    }
