import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.applet.*;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;


public class Board extends JComponent implements KeyListener {

    int testBoxX;
    int testBoxY;
    int oneUnit;
    PositionedImage player;

    public Board() {
        testBoxX = 0;
        testBoxY = 0;
        oneUnit = 72;
        // set the size of your draw board
        setPreferredSize(new Dimension(720, 720));
        setVisible(true);
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        PositionedImage image = new PositionedImage("C:\\Users\\ATOM\\greenfox\\zsomborbencsik\\week-5\\day-2\\floor.png", 0, 0);
        for (int i = 0; i < 10; i++) {
            image.draw(graphics);
            for (int j = 0; j < 10; j++) {
                image.posX += 72;
                image.draw(graphics);
            }
            image.posX = 0;
            image.posY += 72;
        }
        PositionedImage player = new PositionedImage("C:\\Users\\ATOM\\greenfox\\zsomborbencsik\\week-5\\day-2\\hero0.png", testBoxX, testBoxY);
        player.draw(graphics);

        final int[][] matrix = {
                {0, 0, 0, 1, 0, 1, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 1, 0, 1, 1, 0},
                {0, 1, 1, 1, 0, 1, 0, 1, 1, 0},
                {0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
                {1, 1, 1, 1, 0, 1, 1, 1, 1, 0},
                {0, 1, 0, 1, 0, 0, 0, 0, 1, 0},
                {0, 1, 0, 1, 0, 1, 1, 0, 1, 0},
                {0, 0, 0, 0, 0, 1, 1, 0, 1, 0},
                {0, 1, 1, 1, 0, 0, 0, 0, 1, 0},
                {0, 0, 0, 1, 0, 1, 1, 0, 0, 0}};

        int[][] wallposition = new int[10][10];
        for (int i = 0; i < 10; i++) {
            wallposition[i][0] = i * oneUnit;
            for (int j = 0; j < 10; j++) {
                wallposition[0][j] = j * oneUnit;
            }
        }
        for (int t = 0; t < matrix.length; t++) {
            for (int j = 0; j < matrix[t].length; j++) {
                if(matrix[t][j] == 1) {
                    PositionedImage wall = new PositionedImage("wall.png", wallposition[0][j], wallposition[t][0]);
                    wall.draw(graphics);
                }
            }
        }
        int imageCount = 4;
        Image[] imageStripes = new Image[imageCount];
        for (int i = 0; i < imageCount; i++) {
            try {
                imageStripes[i] = ImageIO.read(new File(String.format("C:\\Users\\ATOM\\greenfox\\zsomborbencsik\\week-5\\day-2\\hero" +i +".png", i)));
            } catch (IOException e) {
            }
        }
    }

    // To be a KeyListener the class needs to have these 3 methods in it
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    // But actually we can use just this one for our goals here
    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP && testBoxY > 0) {
            testBoxY -= 72;
        } else if(e.getKeyCode() == KeyEvent.VK_DOWN && testBoxY <720 - oneUnit) {
            testBoxY += 72;
        } else if(e.getKeyCode() == KeyEvent.VK_LEFT && testBoxX > 0) {
            testBoxX -= 72;
        } else if(e.getKeyCode() == KeyEvent.VK_RIGHT && testBoxX <720 - oneUnit) {
            testBoxX += 72;
        }
        // and redraw to have a new picture with the new coordinates
        repaint();
    }
}