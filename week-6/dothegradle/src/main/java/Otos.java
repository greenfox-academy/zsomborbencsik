import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Otos {
    public static void main(String[] args) {
        String csvFilename = "C:\\Users\\ATOM\\greenfox\\zsomborbencsik\\week-6\\dothegradle\\src\\main\\java\\otos.csv";
        String csv = "C:\\Users\\ATOM\\greenfox\\zsomborbencsik\\week-6\\dothegradle\\src\\main\\java\\otos2.csv";
        CSVWriter writer = null;
        CSVReader reader = null;
        String[] lines = new String[]{};
        Path filepatty = Paths.get(csvFilename);

        String [] nextLine;
        try {
            reader = new CSVReader(new FileReader(csvFilename));
            while ((nextLine = reader.readNext()) != null) {
                System.out.println(nextLine[1]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
                writer = new CSVWriter(new FileWriter(csv));

            } catch (IOException e) {
                e.printStackTrace();
            }
            try {

                for (int i = 0; i < Files.readAllLines(filepatty).size(); i++) {
                    if (reader != null) {
                        writer.writeNext(reader.readNext());
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
    }

}
