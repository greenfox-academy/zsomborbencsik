public class Flower extends Plants {

    public Flower(float waterNeed, int plantNumber, String plantColor) {
        this.waterNeed = waterNeed;
        this.plantNumber = plantNumber;
        this.plantColor = plantColor;
    }
    public Flower() {
        this.waterNeed = 5;
        this.plantNumber = 2;
        this.absorb = 0.75f;


    }
}
