package main.java.music;

public class Violin extends StringedInstrument {

    public Violin() {
        this.instrumentName = "Violin ";
        this.numberOfStrings = 4;
    }
    @Override
    public String sound() {
        return "Screech";
    }
    @Override
    public void play() {
        System.out.println(this.instrumentName + ", a " + this.numberOfStrings + "-stringed instrument that" + this.sound());
    }
}
