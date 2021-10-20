package session2Tommy.Excercises.Excercise7;

public class Square implements Shape{
    int edges = 4;
    int height;
    int width;

    public Square(int height, int width) {
        this.height = height;
        this.width = width;
    }


    @Override
    public float calcArea() {
        return height * width;
    }

    @Override
    public float calcCircumference() {
        return 2* (height + width);
    }

    @Override
    public int getNumberOfEdges() {
        return edges;
    }
}
