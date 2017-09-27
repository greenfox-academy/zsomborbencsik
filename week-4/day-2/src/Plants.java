public class Plants {
    float waterNeed;
    int plantNumber;
    int wateramount;
    String plantColor;
    float absorb;


    public Plants() {
        this.waterNeed = 0;
        this.plantNumber = 0;
        this.wateramount = 0;
        this.plantColor = "";
        this.absorb = 0;
    }


    public float watering(int wateramount) {
        if (wateramount <= 40) {
            waterNeed = (waterNeed + wateramount) * absorb;
        }
        return waterNeed;
    }

}
