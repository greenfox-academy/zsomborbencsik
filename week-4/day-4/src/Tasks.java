import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tasks {
    String description;
    int numberOfTasks;
    List<String> lines;

    public Tasks() {
        this.description = "";
        this.numberOfTasks = 0;
        this.lines = new ArrayList<>();
    }
    public void addDescription(String description) {
        this.description = description;
    }
    public void addToList(String addtoList) {
        this.lines.add(addtoList);
        Tasks newtask = new Tasks();
        newtask.addToFile(lines);
    }
    public void checkTask(int index) {
        lines.set(index, "");
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
            lines.remove(removLin1e -1);
        } catch (Exception e) {
            System.out.println("Unable to remove: index is out of bound");
        }
    }
    public int getListSize() {
        int b = lines.size();
        return b;
    }
    public void addToFile(List<String> task) {
        Path filePath = null;
        try {
            filePath = Paths.get("C:\\Users\\ATOM\\greenfox\\zsomborbencsik\\week-4\\day-4\\src\\example.txt");
            Files.write(filePath, task, StandardOpenOption.APPEND);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void listAllTasks() {
        for (int i = 0; i < lines.size(); i++) {
            System.out.println(i + 1 + " - " + "[] " + lines.get(i));
        }
    }
    public void addAllTasks() {
        Path filePath = Paths.get("C:\\Users\\ATOM\\greenfox\\zsomborbencsik\\week-4\\day-4\\src\\example.txt");
        this.lines = null;
        try {
            lines = Files.readAllLines(filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



