package session2Tommy.Excercises.Excercise7;

public class Triangle implements Shape{
    int edges = 3;
    int height;
    int base;
    int a, b, c;

    public Triangle(int height, int base, int a, int b, int c) {
        this.height = height;
        this.base = base;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public float calcArea() {
        return (float) (0.5 * height * base);
    }

    @Override
    public float calcCircumference() {
        return a + b + c;
    }

    @Override
    public int getNumberOfEdges() {
        return this.edges;
    }
}
