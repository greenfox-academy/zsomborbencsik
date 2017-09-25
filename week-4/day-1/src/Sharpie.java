public class Sharpie {
    String color;
    float width;
    float inkAmount;

    public float use() {
        inkAmount -= 20;
    }

    public static void main(String[] args) {
        Sharpie thiccSharpie = new Sharpie();
        thiccSharpie.use();
    }
}
