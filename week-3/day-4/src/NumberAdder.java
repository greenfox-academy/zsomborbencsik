public class NumberAdder {
    public static void main(String[] args) {
        System.out.println(numberadder(5));

    }
    static int numberadder (int n) {
        if (n == 1) {
            return 1;
        }
        else {
            for (int i = 0; i < 5; i++) {
                n += 1;
            }
            return n;
        }

    }
}

// Write a recursive function that takes one parameter: n and adds numbers from 1 to n.