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
        this.randomnumber = rand.nextInt(9999) + 1000;
    }
    public int[] inttolist(int guess) {
        for (int i = 0; i < 4; i++) {
            int [] tempint = 
        }

    public void compareLists(int[] input1, int[] input2) {
        for (int i = 0; i < input1.length; i++) {
            if (input1[i] == input2[i]) {
                System.out.println("cow at " + i);
            }
        }
    }

    public static void main(String[] args) {
        CAB newcab = new CAB();
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter a 4 digit number: ");
        int user_guess = myScanner.nextInt();
        int [] playerguess = newcab.inttolist(user_guess);

    }

}
