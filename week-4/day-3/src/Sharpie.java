public class Sharpie {
    String color;
    float width;
    float inkAmount;

    public Sharpie() {
        this.color = "red";
        this.width = 5;
        this.inkAmount = 100;
    }

    public float use() {
        inkAmount -= 20;
        return  inkAmount;
    }
    public void countUsable() {
        Sharpie nicesharpie = new Sharpie();
        if (nicesharpie.inkAmount > 0) {
            System.out.println("Usable");
        } else {
            nicesharpie.removeTrash(nicesharpie);
            System.out.println("Not usable");
        }

    }
    public void removeTrash(Sharpie sharpie) {
        sharpie = null;
    }

    public static void main(String[] args) {
        Sharpie thiccSharpie = new Sharpie();
        thiccSharpie.use();
        thiccSharpie.countUsable();
    }
}