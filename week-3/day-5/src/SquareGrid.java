import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SquareGrid {

    public static void mainDraw(Graphics graphics){

        SquareGrid(graphics,0,0, HEIGHT, 4);

    }
    static int SquareGrid (Graphics g, int x, int y, int size, int n) {
        g.setColor(Color.BLACK);

        for (int i = 0; i < n *3; i++) {
            g.drawRect(x + (size/4) + i, y + (size/4) + i, (size/2) - i, (size/2) - i);
            g.drawRect(x + (size/4), y + (size/4), (size/2) - i, (size/2) - i);
        }
        if (n == 0) {
            return 0;
        } else {
            SquareGrid(g, x , y , size/2, n-1);
            SquareGrid(g, x + size/2 , y , size/2, n-1);
            SquareGrid(g, x,y + size/2, size/2, n-1);
            SquareGrid(g, x + size/2,y + size/2, size/2, n-1);

        }




        return  0;

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