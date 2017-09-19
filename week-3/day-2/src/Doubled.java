import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import javax.crypto.spec.SecretKeySpec;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Doubled {

    public static void main(String[] args) {
        // Create a method that decrypts the duplicated-chars.txt
        decrypt("my-file.txt");
    }

    public static void decrypt(String strEncrypted) {
        try {
            Path path = Paths.get(strEncrypted);
            List<String> myList = Files.readAllLines(path);
            List<String> finalList = new ArrayList<>();

            for (int i = 0; i < myList.size(); i++) {
                List<String> myWords = new ArrayList<String>(Arrays.asList(myList.get(i).split("")));
                String lines = "";
                for (int j = 0; j < myWords.size(); j++) {
                    if ((j % 2) == 0) {
                        lines += myWords.get(j);
                    }
                }
                finalList.add(lines);

            }
            Files.write(path, finalList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}