import javax.swing.*;

import java.awt.*;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class GoToCenter {

    public static void mainDraw(Graphics graphics){
        Scanner myScan = new Scanner(System.in);
        System.out.print("Enter coordinates: ");
        int x = myScan.nextInt();
        int y = myScan.nextInt();
        drawer(graphics,x,y);
        System.out.print("Enter coordinates: ");
        x = myScan.nextInt();
        y = myScan.nextInt();
        drawer(graphics,x,y);
        System.out.print("Enter coordinates: ");
        x = myScan.nextInt();
        y = myScan.nextInt();
        drawer(graphics,x,y);




    }
    public static void drawer(Graphics g, int x, int y) {
        g.setColor(Color.BLACK);
        g.drawLine(x,y, WIDTH / 2,HEIGHT /2);

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