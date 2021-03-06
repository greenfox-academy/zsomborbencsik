import java.awt.*;
import java.util.Random;

public class Character extends PositionedImage {
    int characterMaxHp;
    int characterCurrentHp;
    int characterLevel;
    int characterDefensePoint;
    int characterStrikePoint;
    String characterName;
    Random random;
    Map map;
    int d6;

    public Character(String filename, int posX, int posY) {
        super(filename,posX,posY);
        this.characterMaxHp = 0;
        this.characterCurrentHp = 0;
        this.characterLevel = 1;
        this.characterDefensePoint = 0;
        this.characterStrikePoint = 0;
        random = new Random();
        d6 = random.nextInt(6) + 1;
        map = new Map();
    }

    public void drawHUD(Graphics g, Character character, int hudposX, int hudposY) {
        g.drawString(character.characterName + "Level: " + character.characterLevel + "HP: " + characterCurrentHp + "\\" + characterMaxHp + "|" +  "DP: " + characterDefensePoint + "|" + "SP: " +character.characterStrikePoint,hudposX,hudposY);
    }

    public void strike(Character character, Character character2) {
        character2.characterCurrentHp -= character.characterStrikePoint;
    }
    public void setRandomPosition(Character character) {
        int randomPositionX = random.nextInt(10) + 1;
        int randomPositionY = random.nextInt(10) + 1;

    }
}
