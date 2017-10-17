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
import java.util.Random;
import java.util.concurrent.TimeUnit;


public class Board extends JComponent implements KeyListener {

    int oneUnit;
    Map map;
    Hero achilles;
    ArrayList<Skeleton> skeletons;
    Boss negan;
    Monster npcs;

    public Board() {
        map = new Map();
        achilles = new Hero();
        negan = new Boss();
        oneUnit = 72;

        setPreferredSize(new Dimension(720, 720));
        setVisible(true);
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        for (int i = 0; i < map.matrix.length; i++) {
            for (int j = 0; j < map.matrix.length; j++) {
                if (map.matrix[i][j] == 1) {
                    PositionedImage wall = new PositionedImage("wall.png",j,i);
                    wall.draw(graphics);
                } else {
                    PositionedImage floorTile = new PositionedImage("C:\\Users\\ATOM\\greenfox\\zsomborbencsik\\week-5\\day-2\\floor.png", j, i);
                    floorTile.draw(graphics);
                }
            }
        }
        /*Skeletons*/
        for (int i = 0; i < skeletons.size(); i++) {
            skeletons.get(i).draw(graphics);
        }

        /*Bosses*/
        negan.posX = 6;
        negan.posY = 2;
        negan.draw(graphics);

        /*Hero*/
        achilles.draw(graphics);
        achilles.drawHUD(graphics,achilles,0, 730);
        /*Fight*/
        if (achilles.posX == negan.posX && achilles.posY == negan.posY) {
            graphics.drawString("You encountered a wild BOSS", 0, 770);
            negan.drawHUD(graphics,negan,0, 750);
            while (negan.characterCurrentHp > 0) {
                achilles.strike(achilles,negan);
                negan.strike(negan,achilles);
            }
        }
    }
    // To be a KeyListener the class needs to have these 3 methods in it
    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP && achilles.posY > 0 && map.matrix[achilles.posY - 1][achilles.posX] != 1) {
            achilles.drawHero("up");
            achilles.posY -= 1;
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN && achilles.posY < 9 && map.matrix[achilles.posY +1][achilles.posX] != 1) {
            achilles.drawHero("down");
            achilles.posY += 1;
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT && achilles.posX > 0 && map.matrix[achilles.posY][achilles.posX -1] != 1) {
            achilles.drawHero("left");
            achilles.posX -= 1;
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT && achilles.posX < 9 && map.matrix[achilles.posY][achilles.posX +1] != 1) {
            achilles.drawHero("right");
            achilles.posX += 1;
        }
        repaint();
    }
    @Override
    public void keyReleased(KeyEvent e) {
    }
}