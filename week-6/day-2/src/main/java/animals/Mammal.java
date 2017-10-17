package main.java.animals;

public class Mammal extends Animal {

    public Mammal(String name) {
        this.name = name;
    }
    @Override
    public String greet() {
        return "Hi how are you?";
    }

    @Override
    public String wantChild() {
        return "want a child from my uterus!";
    }

    @Override
    public String willItEatYou() {
        return "Hope not";
    }
}
