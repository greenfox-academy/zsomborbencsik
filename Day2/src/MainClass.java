public class MainClass {
    public static void main(String args[]) {
        for (int counter = 0; counter <= 10; counter++) {
            System.out.printf("%d! = %d\n", counter, factorial(counter));
        }
    }
    public static long factorial(long input) {
        if (input <= 1) return 1;
        else return input * factorial(input - 1);
    }
}