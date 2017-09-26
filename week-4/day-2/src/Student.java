public class Student extends Person {
    String previousOrganization;
    int skippedDays;
    int numberOfDays;

    public Student(String name, int age, String gender, String previousOrganization) {
        super(name, age, gender);
        this.skippedDays = 0;
        this.previousOrganization = previousOrganization;
    }

    public Student() {
        this.previousOrganization = "School of Life ";
        this.skippedDays = 0;
    }

    public void skipDays(int skippedDays) {
        this.skippedDays += numberOfDays;
    }

    public void getGoal() {
        System.out.println("To become a junior software developer ");
    }

    public void introduce() {
        super.introduce();
        System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + "from " + previousOrganization + "who skipped " + skippedDays + "days from the course already. ");

    }
}
