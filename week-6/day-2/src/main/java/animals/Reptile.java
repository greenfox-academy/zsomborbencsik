package main.java.animals;

public class Reptile extends Animal  {

    public Reptile(String name) {
        this.name = name;
    }

    @Override
    public String greet() {
        return "hissssss";
    }

    @Override
    public String wantChild() {
        if (!this.name.equals("Frog") && !this.name.equals("Viviparous Lizard ")) {
            return " want a child from an egg!";
        } else {
            return "Dunno know where that came from";
        }
    }

    @Override
    public String willItEatYou() {
        return "Most likely";
    }
}
