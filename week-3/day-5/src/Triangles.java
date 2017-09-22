import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {

    public static void mainDraw(Graphics graphics){
        graphics.setColor(Color.GRAY);
        graphics.fillRect(0,0, WIDTH,HEIGHT);
        graphics.setColor(Color.BLACK);
        int[] x = {0, 0, 0};
        int[] y = {0, 0, 0};
        int n = 5;
        int constant = 600;
        triangles(graphics, x, y, constant, n);

    }
    static int triangles (Graphics g,int[] x, int[] y,int constant, int n) {
        int [] x2 = {x[0] , x[1] + (constant / 2), x[2] + constant};
        int [] y2 = {y[0], y[1] + constant, y[2]};
        g.setColor(Color.BLACK);
        g.drawPolygon(x2, y2, 3);
        return  0;


    }


    //    Don't touch the code below
    static int WIDTH = 600;
    static int HEIGHT = (WIDTH * WIDTH) - ((WIDTH / 2) *(WIDTH / 2));

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