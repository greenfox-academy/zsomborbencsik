import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {

    public static void mainDraw(Graphics graphics){
        int x1 = 0;
        int y1 = 0;
        int x2 = 320;
        int y2 = 20;
        graphics.setColor(Color.GREEN);

        for (int i = 0; i < 20; i++) {
            graphics.drawLine(x1,y1,x2,y2);
            x1 += 20;
            y2 += 20;
        }
        x1 = 0;
        y1 = 0;
        x2 = 20;
        y2 = 320;
        graphics.setColor(Color.RED);
        for (int i = 0; i < 20; i++) {
            graphics.drawLine(x1,y1,x2,y2);
            y1 += 20;
            x2 += 20;
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