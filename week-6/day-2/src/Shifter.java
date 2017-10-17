public class Shifter implements CharSequence {
    String word;
    int shiftNumber;

    public Shifter(String word, int shiftNumber) {
        this.word =word;
        this.shiftNumber = shiftNumber;
    }
    @Override
    public int length() {
        return 0;
    }

    @Override
    public char charAt(int index) {
        return this.word.charAt(index + this.shiftNumber);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }

    public static void main(String[] args) {
        Shifter s = new Shifter("example", 2);
        System.out.println(s.charAt(0));
    }
}
