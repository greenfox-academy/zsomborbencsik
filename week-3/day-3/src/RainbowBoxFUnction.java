import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFUnction {

    public static void mainDraw(Graphics graphics){
        // create a square drawing function that takes 2 parameters:
        // the square size, and the fill color,
        // and draws a square of that size and color to the center of the canvas.
        // create a loop that fills the canvas with rainbow colored squares.
        Random rand = new Random();
        int size = 100;
        int numSq = 0;
        while (numSq < 10 && size > 0) {
            drawer(graphics,size,rand.nextInt(250) + 1,rand.nextInt(250) + 1,rand.nextInt(250) + 1);
            size -= 10;
        }


    }
    static void drawer (Graphics g, int size, int color1, int color2, int color3) {
            Color boxColor = new Color(color1, color2, color3);
            g.setColor(boxColor);
            g.fillRect((300 / 2) - (size / 2), (300 / 2) - (size / 2), size, size);

    }

    //    Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }
    static class ImagePanel extends JPanel{
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);

        }
    }

}