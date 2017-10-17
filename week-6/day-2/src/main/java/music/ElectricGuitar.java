package main.java.music;

public class ElectricGuitar extends StringedInstrument {

    public ElectricGuitar() {
        this.instrumentName = "Electric Guitar ";
        this.numberOfStrings = 6;
    }

    public ElectricGuitar(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    @Override
    public String sound() {
        return "Twang";
    }

    @Override
    public void play() {
        System.out.println(this.instrumentName + ", a " + this.numberOfStrings + "-stringed instrument that" + this.sound());
    }
}
