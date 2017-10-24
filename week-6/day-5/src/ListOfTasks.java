import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class ListOfTasks {
    ArrayList<Task> taskList;

    public ListOfTasks() {
        this.taskList = new ArrayList<>();
    }
    public void listAllTask() {
        Path myPath = Paths.get("C:\\Users\\ATOM\\greenfox\\zsomborbencsik\\week-4\\day-4\\src\\example.txt");
        try {
            this.taskList = Files.readAllLines(myPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < taskList.size(); i++) {
            System.out.println(i + 1 + " - " + "[] " + taskList.get(i).description);
        }
    }
    public void readFromFile() {
        Path filePath = null;
        try {
            filePath = Paths.get("C:\\Users\\ATOM\\greenfox\\zsomborbencsik\\week-4\\day-4\\src\\example.txt");
            System.out.println(Files.readAllLines(filePath));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void remove(String input) {
        Path myPath = Paths.get("C:\\Users\\ATOM\\greenfox\\zsomborbencsik\\week-4\\day-4\\src\\example.txt");
        int index = Integer.parseInt(input);
        if (input != " ") {
            try {
                List<String> lines = Files.readAllLines(myPath);
                if (lines.size() > index)
                    try {
                        lines.remove((index - 1));
                    } catch (NumberFormatException e) {
                        System.out.println("Unable to remove: index is not a number");
                    }
                else {
                    System.out.println("Unable to remove: index is out of bound!");
                }
                Files.write(myPath, lines);
            } catch (IOException e) {
                System.out.println("Unable to read file.");
            }
        }
    }
    public void addToFile() {
        Path filePath = null;
        try {
            filePath = Paths.get("C:\\Users\\ATOM\\greenfox\\zsomborbencsik\\week-4\\day-4\\src\\example.txt");
            Files.write(filePath, this.taskList.get(taskList.size() - 1).description.getBytes(), StandardOpenOption.APPEND);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void removeFromList(String removeline) {
        int removLin1e = 0;
        try {
            removLin1e = Integer.parseInt(removeline);
        } catch (NumberFormatException e) {
            System.out.println("Unable to remove: index is not a number");
            return;
        }
        try {
            taskList.remove(removLin1e);
        } catch (Exception e) {
            System.out.println("Unable to remove: index is out of bound");
        }
    }
}
