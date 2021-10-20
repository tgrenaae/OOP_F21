package session2Tommy.Excercises.Excercise7;

public class Circle implements Shape{
    int edges = 0;
    float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    @Override
    public float calcArea() {
        float pi = (float) Math.PI;
        return pi * radius * radius;
    }

    @Override
    public float calcCircumference() {
        return (float) (2 * Math.PI * radius);
    }

    @Override
    public int getNumberOfEdges() {
        return 0;
    }
}
