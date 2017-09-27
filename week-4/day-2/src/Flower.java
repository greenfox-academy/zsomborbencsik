public class Flower extends Plants {

    public Flower(float currentWaterLevel, int plantNumber, String plantColor) {
        this.currentWaterLevel = currentWaterLevel;
        this.plantNumber = plantNumber;
        this.plantColor = plantColor;
    }
    public Flower() {
        this.minimumWaterNeed = 5;
        this.plantNumber = 2;
        this.absorb = 0.75f;
    }
}
