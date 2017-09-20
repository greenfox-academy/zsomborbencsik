import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {

    public static void mainDraw(Graphics graphics){
        int x1 = 150;
        int y1 = 0;
        int x2 = 150;
        int y2 = 150;

        for (int i = 0; i < 10; i++) {
            graphics.drawLine(x1,y1,x2,y2);
            x2 += 15;
            y1 += 15;
        }
        x1 = 150;
        y1 = 0;
        x2 = 150;
        y2 = 150;

        for (int i = 0; i < 10; i++) {
            graphics.drawLine(x1,y1,x2,y2);
            x2 -= 15;
            y1 += 15;
        }
        x1 = 150;
        y1 = 300;
        x2 = 150;
        y2 = 150;

        for (int i = 0; i < 10; i++) {
            graphics.drawLine(x1,y1,x2,y2);
            x2 += 15;
            y1 -= 15;
        }
        x1 = 150;
        y1 = 300;
        x2 = 150;
        y2 = 150;

        for (int i = 0; i < 10; i++) {
            graphics.drawLine(x1,y1,x2,y2);
            x2 -= 15;
            y1 -= 15;
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