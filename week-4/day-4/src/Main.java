import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Command Line Todo application");
            System.out.println("=============================");
            System.out.println();
            System.out.println("Command line arguments: ");
            System.out.println(" -l   Lists all the tasks \n -a   Adds a new task\n -r   Removes an task\n -c   Completes an task");
        }
        Tasks task1 = new Tasks();
        task1.addAllTasks();
        if (args.length > 0 && args[0].equals("-l")){
            task1.listAllTasks();
        }  else if (args.length == 0 && args[0].equals("-l")) {
            System.out.println("You have no tasks for today");
        }
        if (args[0].equals("-a") && args.length == 2) {
            task1.addToList(args[1]);
        } else if (args[0].equals("-a") && args.length == 1) {
            System.out.println("Unable to add: no task provided ");
        }
        if (args.length > 0 && args[0].equals("-r") && args.length == 2){
            task1.removeFromList(args[1]);
            task1.listAllTasks();
        } else if (args[0].equals("-r") && args.length == 1) {
            System.out.println("Unable to remove: no index provided");
        }
        if (args.length == 2 && args[0].equals("-c")) {
            task1.checkTask(Integer.parseInt(args[1]) -1);
            task1.listAllTasks();
        } else throw new IllegalArgumentException("Unsupported argument");
    }
}
