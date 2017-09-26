public class Station {
    int gasAmount;

    public Station() {
        gasAmount = 100;
    }

    public void refill() {
        Car refill = new Car();
        gasAmount -= refill.capacity;
        System.out.println(gasAmount);

    }

    public static void main(String[] args) {



    }
}
