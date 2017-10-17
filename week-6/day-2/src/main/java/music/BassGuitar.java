package main.java.music;

public class BassGuitar extends StringedInstrument {

    public BassGuitar() {
        this.instrumentName = "Bass Guitar ";
        this.numberOfStrings = 4;
    }

    public BassGuitar(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }
    @Override
    public String sound() {
        return "Duum-duum-duum";
    }
    @Override
    public void play() {
        System.out.println(this.instrumentName + ", a " + this.numberOfStrings + "-stringed instrument that" + this.sound());
    }
}
