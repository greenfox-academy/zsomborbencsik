import java.sql.Array;
import java.sql.SQLOutput;
import java.util.*;

public class Car {
    String type;
    String color;
    public Car(carType type, carColor color) {
        this.type = type.toString();
        this.color = color.toString();
    }

    public enum carType {
        HONDA,MAZDA,TOYOTA,FERRARI,PEUGEOT;
    }
    public enum carColor{
        RED,BLUE,BLACK,GREY,GREEN;
    }
    public String getterType() {
        return this.type;
    }
    public String getterColor() {
        return this.color;
    }

    public static void main(String[] args) {
        ArrayList<Car> carlist = new ArrayList<>();
        Map<String, Integer> carTypes = new LinkedHashMap<>();
        Map<String, Integer> carColors = new LinkedHashMap<>();
        Map<String, Integer> allCar = new LinkedHashMap<>();
        for (int i = 0; i < 256; i++) {
            Random r = new Random();
            Random r2 = new Random();
            int random2 = r2.nextInt(5);
            int random = r.nextInt(5);
            carlist.add(new Car(carType.values()[random], carColor.values()[random2]));
        }
        for (int i = 0; i < carlist.size(); i++) {
            if (!carTypes.containsKey(carlist.get(i).getterType())) {
                carTypes.put(carlist.get(i).getterType(), 1);
            } else {
                carTypes.put(carlist.get(i).getterType(), carTypes.get(carlist.get(i).getterType()) +1);
            }
            System.out.println(carlist.get(i).type + carlist.get(i).color);
        }
        for (int i = 0; i < carlist.size(); i++) {
            if (!carColors.containsKey(carlist.get(i).getterColor())) {
                carColors.put(carlist.get(i).getterColor(), 1);
            } else {
                carColors.put(carlist.get(i).getterColor(), carColors.get(carlist.get(i).getterColor()) +1);
            }
            System.out.println(carlist.get(i).type + carlist.get(i).color);
        }
        for (int i = 0; i < carlist.size(); i++) {
            if (!allCar.containsKey(carlist.get(i).type + carlist.get(i).color)) {
                allCar.put(carlist.get(i).type + carlist.get(i).color, 1);
            } else {
                allCar.put(carlist.get(i).type + carlist.get(i).color, allCar.get(carlist.get(i).type + carlist.get(i).color) +1);
            }
            System.out.println(carlist.get(i).type + carlist.get(i).color);
        }
            System.out.println(Arrays.asList(carTypes));
            System.out.println(Arrays.asList(carColors));
            System.out.println(Arrays.asList(allCar));
    }
}
