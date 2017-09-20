import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlayQuarters {

    public static void mainDraw(Graphics graphics){
        int x1 = 0;
        int y1 = 0;
        int x2 = 0;
        int y2 = 320;

        for (int i = 0; i < 4; i++) {
            graphics.setColor(Color.GREEN);
            graphics.drawLine(x1,y1,x2,y2);
            for (int j = 0; j < 4; j++) {
                x1 += 75/4;
                x2 += 75/4;
                graphics.setColor(Color.RED);
                graphics.drawLine(x1,y1,x2,y2);
            }
        }
        x1 = 0;
        x2 = 320;
        y2 = 0;
        for (int i = 0; i < 4; i++) {
            graphics.setColor(Color.GREEN);
            graphics.drawLine(x1,y1,x2,y2);
            for (int j = 0; j < 4; j++) {
                y1 += 75/4;
                y2 += 75/4;
                graphics.setColor(Color.RED);
                graphics.drawLine(x1,y1,x2,y2);
            }
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