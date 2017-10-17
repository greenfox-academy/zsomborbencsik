public class Gnirts implements CharSequence {
    String yoyo;

    public Gnirts(String yoyo) {
        this.yoyo = yoyo;
    }

    @Override
    public int length() {
        return this.yoyo.length();
    }

    @Override
    public char charAt(int index) {
        return this.yoyo.charAt(yoyo.length() - index - 1);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }

    public static void main(String[] args) {
        Gnirts lilGnirt = new Gnirts("heya");
        System.out.println(lilGnirt.length());
        Gnirts g = new Gnirts("example");
        System.out.println(g.charAt(1));
    }
}


