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
    Boss negan;

    public Board() {
        achilles = new Hero();
        skeletons = new ArrayList<>();
        skeletons.add(new Skeleton());
        skeletons.add(new Skeleton());
        skeletons.add(new Skeleton());
        negan = new Boss();
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
        /*Skeletons*/
        skeletons.get(0).posX = 2*oneUnit;
        skeletons.get(0).posY = 3*oneUnit;
        skeletons.get(0).draw(graphics);
        skeletons.get(1).posX = 4*oneUnit;
        skeletons.get(1).posY = 7*oneUnit;
        skeletons.get(1).draw(graphics);
        skeletons.get(2).posX = 7*oneUnit;
        skeletons.get(2).posY = 9*oneUnit;
        skeletons.get(2).draw(graphics);

        /*Bosses*/
        negan.posX = 6*oneUnit;
        negan.posY = 2*oneUnit;
        negan.draw(graphics);

        /*Hero*/
        achilles.draw(graphics);
        achilles.drawHUD(graphics,achilles,0, 730);
        /*HUD*/
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