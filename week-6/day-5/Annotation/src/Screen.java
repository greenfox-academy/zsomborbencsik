import java.util.Scanner;

public class Screen {
    int x;
    int y;

    public Screen(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @interface Monitor {

    }

    public static void main(String[] args) {
        Screen display = new Screen(1920,1080);
        @Monitor

    }
}
