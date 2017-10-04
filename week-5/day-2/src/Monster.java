public class Monster extends Character {
    int x = this.characterLevel;

    public Monster(String filename, int posX, int posY) {
        super(filename, posX, posY);
        this.characterMaxHp = 2 * x * d6;
        this.characterCurrentHp = 2 * x * d6;
        this.characterLevel = 1;
        this.characterDefensePoint =  x/2 * d6;
        this.characterStrikePoint = x * d6;
    }
}
