package session2Tommy.Excercises.Excercise8;

public class Employee extends Person{
    String job;
    String title;
    int salary;

    public Employee(String name, int age, String job, String title, int salary) {
        super(name, age);
        this.job = job;
        this.title = title;
        this.salary = salary;
    }
}
