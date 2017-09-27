public class Fibonacci {

    public int dothefibo (int n) {
        return  (n <= 1) ? n : dothefibo(n-1) + dothefibo(n -2);
    }
}
