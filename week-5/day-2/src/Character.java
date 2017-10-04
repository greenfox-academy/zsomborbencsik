import java.awt.*;

public class Character extends PositionedImage {
    int characterMaxHp;
    int characterCurrentHp;
    int characterLevel;
    int characterDefensePoint;
    int characterStrikePoint;
    String characterName;

    public Character(String filename, int posX, int posY) {
        super(filename,posX,posY);
        this.characterMaxHp = 0;
        this.characterCurrentHp = 0;
        this.characterLevel = 0;
        this.characterDefensePoint = 0;
        this.characterStrikePoint = 0;
    }

    public void drawHUD(Graphics g, Character character, int hudposX, int hudposY) {
        g.drawString(character.characterName + "Level: " + character.characterLevel + "HP: " + characterCurrentHp + "\\" + characterMaxHp + "|" +  "DP: " + characterDefensePoint + "|" + "SP: " +character.characterStrikePoint,hudposX,hudposY);
    }
}
