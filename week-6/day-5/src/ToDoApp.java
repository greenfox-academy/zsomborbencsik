import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ToDoApp {

    public static void main(String[] args) {
        ListOfTasks listOne = new ListOfTasks();


        if (args.length == 0) {
            printUI();
        }
        else if (args[0].equals("-l")){
            listOne.readFromFile();
        }  else if (args.length == 0 && args[0].equals("-l")) {
            System.out.println("You have no tasks for today");
        }
        else if (args[0].equals("-a") && args.length == 2) {
            listOne.taskList.add(new Task(args[1]));
            listOne.addToFile();
        } else if (args[0].equals("-a") && args.length == 1) {
            System.out.println("Unable to add: no task provided ");
        }
        else if (args.length > 0 && args[0].equals("-r") && args.length == 2){
            listOne.remove(args[1]);
            listOne.removeFromList("2");
            if (args[1].equals("all")) {
                listOne.taskList.clear();
            }
        } else if (args[0].equals("-r") && args.length == 1) {
            System.out.println("Unable to remove: no index provided");
        }
        else if (args.length == 2 && args[0].equals("-c")) {

        } else throw new IllegalArgumentException("Unsupported argument");

    }
    public static void printUI() {
        System.out.println("Command Line Todo application");
        System.out.println("=============================");
        System.out.println();
        System.out.println("Command line arguments: ");
        System.out.println(" -l   Lists all the tasks \n -a   Adds a new task\n -r   Removes an task\n -c   Completes an task");
    }

}
