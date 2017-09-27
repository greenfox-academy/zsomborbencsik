public class Plants {
    float minimumWaterNeed;
    float currentWaterLevel;
    int plantNumber;
    int wateramount;
    String plantColor;
    float absorb;


    public Plants() {
        this.minimumWaterNeed = 0;
        this.plantNumber = 0;
        this.wateramount = 0;
        this.plantColor = "";
        this.absorb = 0;
        this.currentWaterLevel = 0;
    }
    public void needsWater() {
        if (currentWaterLevel >= 0) {
            System.out.println("Needs water");
        }
    }


    public float watering(int wateramount) {
        if (wateramount <= 40) {
            currentWaterLevel = (currentWaterLevel + wateramount) * absorb;
        }
        return currentWaterLevel;
    }

}
