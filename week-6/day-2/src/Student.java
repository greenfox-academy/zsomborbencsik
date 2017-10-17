public class Student implements Cloneable {
    String name;
    int age;
    String gender;
    String school;

    public Student(String name, int age, String gender, String school) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.school = school;
    }


    @Override
    public Student clone() {
       return new Student(this.name,this.age,this.gender,this.school);
    }

    public static void main(String[] args) {
        Student john = new Student("John Doe", 20, "male", "BME");
        Student johnTheClone = john.clone();
        System.out.println(johnTheClone.name);
    }
}
