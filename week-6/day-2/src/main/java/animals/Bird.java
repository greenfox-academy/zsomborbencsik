package main.java.animals;

public class Bird extends Animal  {

    public Bird(String name) {
        this.name = name;
    }
    @Override
    public String greet() {
        return "Chirp chrip";
    }

    @Override
    public String wantChild() {
            return " want a child from an egg!";
    }

    @Override
    public String willItEatYou() {
        return "Probably not unless you meet an angry goose";
    }
}
