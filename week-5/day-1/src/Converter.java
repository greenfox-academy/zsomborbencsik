import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Converter {

    List<String>singleDigits = new ArrayList<>(Arrays.asList("zero","one","two","three","four","five","six","seven","eight","nine"));
    List<String>betweenTenTwenty = new ArrayList<>(Arrays.asList("ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"));
    List<String>betweenTwentyHundred = new ArrayList<>(Arrays.asList("ten","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"));

    public String converter (int number) {

        if(number < 10) {
            return singleDigits.get(number) + " USD";
        }
         else if (number >= 10 && number < 20) {
            return betweenTenTwenty.get(number - 10) + " USD";
        } else if (number >= 20 && number < 100) {
            return betweenTwentyHundred.get(number / 10 - 1) + ((number % 10 == 0) ? "" : singleDigits.get(number % 10)) + " USD";
        } else if (number >= 100 && number < 1000) {
            return singleDigits.get(number / 100) + " hundred " + betweenTwentyHundred.get((number % 100) / 10 - 1) + ((number % 10 == 0) ? "" : singleDigits.get(number % 10)) + " USD";
        }
        return null;
    }
}
