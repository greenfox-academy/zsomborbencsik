public class Counter {
    public static void main(String[] args) {
        System.out.println(counter(5));

    }
    static int counter (int n) {
        if (n == 1) {
            return 1;
        }
        else {
            return n + counter(n - 1);
        }
    }
}


// Write a recursive function that takes one parameter: n and counts down from n.