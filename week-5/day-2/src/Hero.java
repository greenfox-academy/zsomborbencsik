import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class Hero extends Character {

    public Hero() {
        super("hero0.png", 0,0);
        this.characterName = "Achilles";
        this.characterMaxHp = 20 + (3*d6);
        this.characterCurrentHp = 0;
        this.characterLevel = 0;
        this.characterDefensePoint = 2*d6;
        this.characterStrikePoint = 5+d6;
    }

    public void drawHero(String direction) {
        try {
            if (direction.equals("up")) {
                image = ImageIO.read(new File("hero3.png"));
            } else if (direction.equals("right")) {
                image = ImageIO.read(new File("hero2.png"));
            } else if (direction.equals("down")) {
                image = ImageIO.read(new File("hero0.png"));
            } else if (direction.equals("left")) {
                image = ImageIO.read(new File("hero1.png"));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
