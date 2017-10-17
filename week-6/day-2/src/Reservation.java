import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Reservation implements Reservationy {
    ArrayList<String> days;
    String alphabet;
    int N;

    public Reservation() {
        this.days = new ArrayList<>(Arrays.asList("MON","TUE","WED","THU","FRI","SAT","SUN"));
        this.alphabet =  "0123456789ABCDE";
        this.N = alphabet.length();
    }

    @Override
    public String getDowBooking() {
        int rnd = new Random().nextInt(days.size());
        return days.get(rnd);
    }

    @Override
    public String getCodeBooking() {
        String randomCode = "";
        Random r = new Random();
        for (int i = 0; i < 8; i++) {
            randomCode += alphabet.charAt(r.nextInt(N));
        }
        return randomCode;
    }
}
