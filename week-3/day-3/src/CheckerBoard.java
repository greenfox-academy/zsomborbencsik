import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CheckerBoard {

    public static void mainDraw(Graphics graphics){
        int size = 10;
        int xPosition = 0;
        int yPosition = 0;
        int length = 30;
        graphics.setColor(Color.BLACK);
        for (int i = 0; i < length; i++) {
            if (i % 2 != 0) {
                xPosition = size;
                length -= 1;
            }
            else {
                xPosition = 0;
                length = 30;
            }
            for (int j = 0; j < length; j++) {
                if (j % 2 == 0) {
                    graphics.setColor(Color.BLACK);
                } else {
                    graphics.setColor(Color.WHITE);
                }
                graphics.fillRect(xPosition, yPosition, size, size);
            xPosition += size;
            }
            yPosition += size;

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