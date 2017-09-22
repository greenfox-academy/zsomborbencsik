import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SierpinskyCarpet {

    public static void mainDraw(Graphics graphics){
        sierpinsky(graphics,0,0, HEIGHT, 5);

    }
    static int sierpinsky (Graphics g, int x, int y, int size, int n) {
        g.setColor(Color.BLACK);

        g.fillRect(x + (size/3), y + (size/3), size/3,size/3);

        if (n == 0) {
            return 0;
        } else {
        sierpinsky(g, x , y , size/3, n-1);
        sierpinsky(g, x  + (size/3), y , size/3, n-1);
        sierpinsky(g, x  + ((size/3) * 2), y , size/3, n-1);
        sierpinsky(g, x, y + (size/3), size/3, n-1);
        sierpinsky(g, x, y + ((size/3) * 2), size/3, n-1);
        sierpinsky(g, x + (size / 3), y + ((size/3) * 2), size/3, n-1);
        sierpinsky(g, x + ((size/3) * 2), y + ((size/3) * 2), size/3, n-1);
        sierpinsky(g, x + ((size/3) * 2), y + (size/3), size/3, n-1);

        }

        return 0;

    }


    //    Don't touch the code below
    static int WIDTH = 600;
    static int HEIGHT = 600;

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