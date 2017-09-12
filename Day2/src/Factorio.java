import java.util.Scanner;

public class Factorio {
    public static void main(String[] args) {
        
        int in = 4;
        System.out.println(factorio(in));
    }

    public static int factorio (int input) {
        int factorial = 1;
        for (int i= 1; i <= input; i++) {
            factorial = i * factorial;
        }
        return factorial;
    }
}

//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `factorio`
//   that returns it's input's factorial