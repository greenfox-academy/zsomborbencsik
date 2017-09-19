import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WriteMultipleLines {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.print("your word: ");
        String user_input = myScan.next();
        System.out.print("your number: ");
        int user_number = myScan.nextInt();


        something("my-file.txt", user_input, user_number);

    }

    static void something (String path, String word, int number) {
        List<String> content = new ArrayList();
        content.add(word);

        try {
            Path path2 = Paths.get(path);
            for (int i = 0; i < number; i++) {
                Files.write(path2, content, StandardOpenOption.APPEND);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}


// Create a function that takes 3 parameters: a path, a word and a number,
// than it should write to a file.
// The path parameter should be a string, that describes the location of the file.
// The word parameter should be a string, that will be written to the file as lines
// The number paramter should describe how many lines the file should have.
// So if the word is "apple" and the number is 5, than it should write 5 lines
// to the file and each line should be "apple"
// The function should not raise any error if it could not write the file.