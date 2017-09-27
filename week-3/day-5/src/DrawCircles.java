import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class DrawCircles {

    public static void mainDraw(Graphics graphics){
        int constans = HEIGHT;
        circles(graphics,0,0,HEIGHT, 5);




    }
    static int circles (Graphics g, int x, int y, int size, int n) {
        g.setColor(Color.BLACK);
        g.drawOval(x,y,size,size);
        if (n == 0) {
            return 0;
        } else {
            circles(g, x + size/4, y, size/2, n-1);


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