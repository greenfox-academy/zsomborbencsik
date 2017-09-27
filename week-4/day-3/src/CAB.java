import java.util.*;

public class CAB {
    int randomnumber;
    int playerguess;
    boolean playing;
    int guesses;

    public CAB(int randomnumber, int playerguess, boolean playing, int guesses) {
        this.randomnumber = randomnumber;
        this.playerguess = playerguess;
        this.guesses = guesses;
    }
    public CAB() {
        Random rand = new Random();
        this.randomnumber = rand.nextInt(8888) + 1000;
    }
    public ArrayList<Integer> inttolist(int guess) {
        int temp = guess;
        ArrayList<Integer> array = new ArrayList<Integer>();

            do {
                array.add(temp % 10);
                temp /= 10;
            } while (temp > 0);
            return  array;

    }

    public void compareLists(ArrayList<Integer> input1,ArrayList<Integer> input2) {
        int cowcounter = 0;
        int bullcounter = 0;
        for (int i = 0; i < input1.size(); i++) {
            if (input1.get(i) == input2.get(i)) {
                cowcounter++;
            }
            if (input1.contains(input2.get(i))) {
                bullcounter++;

            }
        }
        System.out.println("You have " + cowcounter + " cows.");
        System.out.println("You have " + bullcounter + " bulls.");
    }

    public static void main(String[] args) {
        CAB newcab = new CAB();
        Scanner myScanner = new Scanner(System.in);
        System.out.println(newcab.randomnumber);
        System.out.println("Enter a 4 digit number: ");
        int user_guess = myScanner.nextInt();
        ArrayList<Integer> playerguess = newcab.inttolist(user_guess);
        newcab.compareLists(playerguess, newcab.inttolist(newcab.randomnumber));

    }

}
