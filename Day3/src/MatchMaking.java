import java.util.*;

public class MatchMaking{
    public static void main(String... args){
        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve","Ashley","Bözsi","Kat","Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe","Fred","Béla","Todd","Neef","Jeff"));
        ArrayList<String> order = new ArrayList<String>();
        boolean moreBoysThanGirls = girls.size() < boys.size();
        System.out.println(moreBoysThanGirls);

        if (moreBoysThanGirls) {

            for (int i = 0; i < girls.size(); i++) {
                order.add(girls.get(i));
                order.add(boys.get(i));
            }
            order.add(boys.get(boys.size() - 1));
        }

        System.out.println(order);


        order.addAll(boys);


        // Join the two lists by matching one girl with one boy in the order list
        // Exepected output: "Eve", "Joe", "Ashley", "Fred"...




    }
}