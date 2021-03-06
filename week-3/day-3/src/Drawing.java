import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Drawing {

    public static void mainDraw(Graphics graphics){

        graphics.setColor(Color.BLUE);
        graphics.fillRect(50,50,100,100);
        graphics.setColor(Color.RED);
        graphics.drawRect(50,50,100,100);

        int[] xPoints = {0,200,200};
        int[] yPoints = {0,0,200};
        graphics.drawPolygon(xPoints, yPoints,3);

        graphics.fillOval(400,600,40,42);
        //  draw a red horizontal line to the canvas' middle.
        //  draw a green vertical line to the canvas' middle.



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