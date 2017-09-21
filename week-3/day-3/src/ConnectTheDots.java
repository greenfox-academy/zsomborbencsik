import javax.swing.*;

import java.awt.*;
import java.util.Arrays;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ConnectTheDots {

    public static void mainDraw(Graphics graphics){
        // create a function that takes 1 parameter:
        // an array of {x, y} points
        // and connects them with green lines.
        // connect these to get a box: {{10, 10}, {290,  10}, {290, 290}, {10, 290}}
        // connect these: {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
        // {120, 100}, {85, 130}, {50, 100}}
        int[][] box1 = new int[][]{{10, 10}, {290,  10}, {290, 290}, {10, 290}};
        int[][] box2 = new int[][]{{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70}, {120, 100}, {85, 130}, {50, 100}};
        boolean boxsize = box1.length >= box2.length;
        drawer(graphics,box1);

    }
    static void drawer (Graphics g, int[][] wholebox) {
            g.setColor(Color.GREEN);
        for (int i = 0; i < wholebox.length; i++) {
                g.drawLine(wholebox[i][0], wholebox[i][1],wholebox[i+1][0],wholebox[i+1][1]);

        }
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


// create a 300x300 canvas.