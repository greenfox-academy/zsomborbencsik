public class Tree extends Plants {

    public Tree(float currentWaterLevel, int plantNumber, String plantColor) {
        this.currentWaterLevel = currentWaterLevel;
        this.plantNumber = plantNumber;
        this.plantColor = plantColor;
    }
    public Tree() {
        this.minimumWaterNeed = 10;
        this.plantNumber = 2;
        this.absorb = 0.4f;

    }
}
