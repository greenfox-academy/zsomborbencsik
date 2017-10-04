import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;


public class Board extends JComponent implements KeyListener {

    int oneUnit;
    int[][] matrix;
    Hero achilles;
    ArrayList<Skeleton> skeletons;

    public Board() {
        achilles = new Hero();
        skeletons = new ArrayList<>(Arrays.asList());
        oneUnit = 72;
        matrix = new int[][]{
                {0, 0, 0, 1, 0, 1, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 1, 0, 1, 1, 0},
                {0, 1, 1, 1, 0, 1, 0, 1, 1, 0},
                {0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
                {1, 1, 1, 1, 0, 1, 1, 1, 1, 0},
                {0, 1, 0, 1, 0, 0, 0, 0, 1, 0},
                {0, 1, 0, 1, 0, 1, 1, 0, 1, 0},
                {0, 0, 0, 0, 0, 1, 1, 0, 1, 0},
                {0, 1, 1, 1, 0, 0, 0, 0, 1, 0},
                {0, 0, 0, 1, 0, 1, 1, 0, 0, 0}
        };

        setPreferredSize(new Dimension(720, 720));
        setVisible(true);
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] == 1) {
                    PositionedImage wall = new PositionedImage("wall.png",j*oneUnit,i*oneUnit);
                    wall.draw(graphics);
                } else {
                    PositionedImage floorTile = new PositionedImage("C:\\Users\\ATOM\\greenfox\\zsomborbencsik\\week-5\\day-2\\floor.png", j*oneUnit, i*oneUnit);
                    floorTile.draw(graphics);
                }
            }
        }
        skeleton1.posX = 2*oneUnit;
        skeleton1.posY = 3*oneUnit;
        skeleton1.draw(graphics);
        achilles.draw(graphics);
    }
    // To be a KeyListener the class needs to have these 3 methods in it
    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP && achilles.posY / oneUnit != 0 && matrix[achilles.posY / oneUnit-1][achilles.posX / oneUnit] != 1) {
            achilles.drawHero("up");
            achilles.posY -= oneUnit;
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN && achilles.posY / oneUnit <= 9 && matrix[achilles.posY / oneUnit +1][achilles.posX / oneUnit] != 1) {
            achilles.drawHero("down");
            achilles.posY += oneUnit;
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT && achilles.posX / oneUnit != 0 && matrix[achilles.posY / oneUnit][achilles.posX / oneUnit -1] != 1) {
            achilles.drawHero("left");
            achilles.posX -= oneUnit;
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT && achilles.posX / oneUnit <= 9 && matrix[achilles.posY / oneUnit][achilles.posX / oneUnit +1] != 1) {
            achilles.drawHero("right");
            achilles.posX += oneUnit;
        }
        repaint();
    }
    @Override
    public void keyReleased(KeyEvent e) {
    }
}