package main.java.animals;

public abstract class Animal {
    String name;
    int age;
    String gender;
    String diet;

    public abstract String greet();
    public abstract String wantChild();
    public abstract String willItEatYou();

    public String getName() {
        return this.name;
    }
}
