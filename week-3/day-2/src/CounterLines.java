import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CounterLines {
    public static void main(String[] args) {
        System.out.println(numberoflines("lorem-ipsum.txt"));

    }

    static int numberoflines (String path) {
        Path path2 = Paths.get("lorem-ipsum.txt");
        int number = 0;
        try {
            List<String> lines = Files.readAllLines(path2);
            number = lines.size();
            return number;
        } catch (IOException e) {
            return 0;
        }


        }


    }


// Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.