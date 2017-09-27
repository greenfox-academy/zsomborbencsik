import java.util.HashMap;
import java.util.Map;

public class Letters {

    public Map<Character, Integer> countLetter(String text) {
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (map.containsKey(c)) {
                int cnt = map.get(c);
                map.put(c, ++cnt);
            } else {
                map.put(c, 1);
            }
        }
        return map;
    }

}
