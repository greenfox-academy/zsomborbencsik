public class Boss extends Monster {

    public Boss() {
        super("boss.png",0,0);
        this.characterName = "Negan";
        this.characterMaxHp = 2 * x * d6 + d6;
        this.characterDefensePoint =  x/2 * d6 + (d6/2);
        this.characterStrikePoint = x * d6 + x;
    }
}
