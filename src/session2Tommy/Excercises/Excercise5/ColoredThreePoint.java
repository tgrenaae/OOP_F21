package session2Tommy.Excercises.Excercise5;

public class ColoredThreePoint extends ThreePoint{
    String color;

    public ColoredThreePoint(int x, int y, int z, String color) {
        super(x, y, z);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
