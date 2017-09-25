public class Animal {
    int hunger = 50;
    int thirst = 50;

    public int eat() {
        hunger -= 1;
        return hunger;
    }
    public int drink() {
        thirst -= 1;
        return  thirst;

    }
    public int play() {
        hunger += 2;
        thirst+= 2;
        return  hunger + thirst;
    }

    public static void main(String[] args) {
        Animal tiger = new Animal();
        tiger.play();

        System.out.println(tiger.hunger);


    }
}
