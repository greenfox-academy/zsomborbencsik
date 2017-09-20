import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

    public static void mainDraw(Graphics graphics){
        graphics.setColor(Color.GREEN);
        graphics.drawRect(50,50, 100,100);
        graphics.setColor(Color.RED);
        graphics.drawRect(50,50, 50,100);
        graphics.setColor(Color.BLACK);
        graphics.drawRect(50,50, 80,70);
        graphics.setColor(Color.BLUE);
        graphics.drawRect(50,50, 68,190);
        // draw four different size and color rectangles.



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