package session2Tommy.Excercises.Excercise8;

public class Manager extends Employee{
    int bonus;

    public Manager(String name, int age, String job, String title, int salary, int bonus) {
        super(name, age, job, title, salary);
        this.bonus = bonus;
    }
}
