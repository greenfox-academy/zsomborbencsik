import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CopyFile {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter filename: ");
        String user_filename = myScanner.next();
        System.out.print("Enter filename2: ");
        String user_filename2 = myScanner.next();

        boolean iftrue = copier(user_filename,user_filename2);

        System.out.println("File copied: " + iftrue);


    }

    static boolean copier (String filename, String filename2) {
        try {
        Path path = Paths.get(filename2);
        List<String> file2 = Files.readAllLines(path);
            Files.write(Paths.get(filename), file2, StandardOpenOption.APPEND);
            return true;
        }catch (IOException e) {
            return false;
        }
    }
}

// Write a function that copies a file to an other
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful