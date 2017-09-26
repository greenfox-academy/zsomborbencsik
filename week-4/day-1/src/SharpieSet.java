import java.util.ArrayList;
import java.util.List;

public class SharpieSet {
    List<Sharpie> sharpie = new ArrayList<>();

    public void countUsable() {
        Sharpie inkamount = new Sharpie();
        if (inkamount.inkAmount > 0) {
            System.out.println("Usable");
        } else {
            System.out.println("Not usable");
        }

    }
}
