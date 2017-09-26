public class Mentor extends Person {
    String progLevel;

    public Mentor() {
        this.progLevel = "";
    }
    public Mentor(String name, int age, String gender, String level) {
        super(name, age, gender);
        this.progLevel = level;

    }
    public void getGoal() {
        System.out.println("Educate brilliant junior software developers. ");
    }

    public void introduce() {
        System.out.println("Hi, I'm " + name +", a " + age + "year old " + gender + progLevel + "mentor. ");
    }
}
