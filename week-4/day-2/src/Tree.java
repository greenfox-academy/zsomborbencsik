public class Tree extends Plants {

    public Tree(float waterNeed, int plantNumber, String plantColor) {
        this.waterNeed = waterNeed;
        this.plantNumber = plantNumber;
        this.plantColor = plantColor;
    }
    public Tree() {
        this.waterNeed = 10;
        this.plantNumber = 2;
        this.absorb = 0.4f;

    }
}
