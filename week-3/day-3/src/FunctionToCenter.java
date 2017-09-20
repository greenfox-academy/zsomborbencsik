import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {

    public static void mainDraw(Graphics graphics){
        // create a line drawing function that takes 2 parameters:
        // the x and y coordinates of the line's starting point
        // and draws a line from that point to the center of the canvas.
        // fill the canvas with lines from the edges, every 20 px, to the center.
        int xLinePosition = 0;
        int yLinePosition = 0;

            if (yLinePosition <= 300) {
                for (int i = 0; i < 15; i++) {
                    yLinePosition += 20;
                    drawer(graphics, xLinePosition, yLinePosition);
                }
                yLinePosition = 0;
                xLinePosition = 320;
                for (int i = 0; i < 15; i++) {
                    yLinePosition += 20;
                    drawer(graphics, xLinePosition, yLinePosition);
                }
                xLinePosition = 0;
            }
            if (xLinePosition <= 300) {
                for (int i = 0; i < 15; i++) {
                    xLinePosition += 20;
                    drawer(graphics, xLinePosition, yLinePosition);
                }
                xLinePosition = 320;
                yLinePosition = 0;
                for (int i = 0; i < 15; i++) {
                    xLinePosition -= 20;
                    drawer(graphics, xLinePosition, yLinePosition);
                }

            }





    }
    static void drawer (Graphics g, int x, int y) {
        g.setColor(Color.BLACK);
        g.drawLine(x, y, 300 / 2, 300 / 2);
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