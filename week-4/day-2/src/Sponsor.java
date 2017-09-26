public class Sponsor extends Person {
    String company;
    int hiredStudents;

    public Sponsor(String name, int age, String gender, String company) {
        super(name, age, gender);
        this.hiredStudents = 0;
        this.company = company;
    }

    public Sponsor() {
        this.company = "Google ";
        this.hiredStudents = 0;
    }

    public void introduce() {
        System.out.println("Hi, I'm " + name +", a " + age + "year old " + gender +  "who represents " + company + "and hire " + hiredStudents + "students so far. ");
    }
    public void hire() {
        hiredStudents++;
    }
    public void getGoal() {
        System.out.println("Hire brilliant junior software developers. ");
    }
}
