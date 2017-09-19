import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class WriteSingleLine {
    public static void main(String[] args) {
        List<String> content = new ArrayList();
        content.add("Zsombor Bencsik");
        try {
            Path path = Paths.get("my-file.txt");
            Files.write(path, content, StandardOpenOption.APPEND);
        } catch (Exception e) {
            System.out.println("Unable to write file: my-file.txt");
        }

    }
}

// Open a file called "my-file.txt"
// Write your name in it as a single line
// If the program is unable to write the file,
// then it should print an error message like: "Unable to write file: my-file.txt"