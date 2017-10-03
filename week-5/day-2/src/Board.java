import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Board extends JComponent implements KeyListener {

    int testBoxX;
    int testBoxY;
    PositionedImage player;

    public Board() {
        testBoxX = 0;
        testBoxY = 0;
        // set the size of your draw board
        setPreferredSize(new Dimension(720, 720));
        setVisible(true);
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        // here you have a 720x720 canvas
        // you can create and draw an image using the class below e.g.
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
        PositionedImage player = new PositionedImage("C:\\Users\\ATOM\\greenfox\\zsomborbencsik\\week-5\\day-2\\hero-down.png", testBoxX, testBoxY);
        player.draw(graphics);
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
        // When the up or down keys hit, we change the position of our box
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            testBoxY -= 72;
        } else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
            testBoxY += 72;
        } else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
            testBoxX -= 72;
        } else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
            testBoxX += 72;
        }
        // and redraw to have a new picture with the new coordinates
        repaint();
    }
}